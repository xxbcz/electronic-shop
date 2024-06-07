package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.entity.SmartphoneEntity;
import com.example.electronicshop.filter.SmartphoneFilterRequest;
import com.example.electronicshop.mapper.SmartphoneMapper;
import com.example.electronicshop.model.SmartphoneModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.repository.SmartphoneRepository;
import com.example.electronicshop.service.SmartphoneService;
import com.example.electronicshop.specification.SmartphoneSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmartphoneServiceImpl implements SmartphoneService {
    private final SmartphoneRepository repository;
    private final PageProperties properties;

    @Override
    public void addSmartphone(SmartphoneModel model) {
        repository.save(SmartphoneMapper.toEntity(model));
    }

    @Override
    public CustomPage<SmartphoneModel> findBy(SmartphoneFilterRequest filter) {
        Specification<SmartphoneEntity> specification = new SmartphoneSpecification(filter);

        if (filter.getSize() < 1 || filter.getSize() > properties.getMaxSize()) {
            filter.setSize(properties.getSize());

        }
        if (filter.getPage() < 1) {
            filter.setPage(properties.getNumber());

        }

        Sort.Direction sort = filter.getSort() == null ? Sort.Direction.ASC : filter.getSort();

        Page<SmartphoneModel> result = repository.findAll(specification,
                        PageRequest.of(filter.getPage() - 1, filter.getSize(),
                                Sort.by(sort, "price")))
                .map(SmartphoneMapper::toModel);

        return CustomPage.<SmartphoneModel>builder()
                .sort(sort)
                .hasNext(!result.isLast())
                .page(filter.getPage())
                .size(filter.getSize())
                .items(result.getContent())
                .build();
    }
}
