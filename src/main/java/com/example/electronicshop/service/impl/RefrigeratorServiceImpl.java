package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.entity.RefrigeratorEntity;
import com.example.electronicshop.filter.RefrigeratorFilterRequest;
import com.example.electronicshop.mapper.RefrigeratorMapper;
import com.example.electronicshop.model.RefrigeratorModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.repository.RefrigeratorRepository;
import com.example.electronicshop.service.RefrigeratorService;
import com.example.electronicshop.specification.RefrigeratorSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RefrigeratorServiceImpl implements RefrigeratorService {
    private final RefrigeratorRepository repository;
    private final PageProperties properties;

    @Override
    public void addRefrigerator(RefrigeratorModel model) {
        repository.save(RefrigeratorMapper.toEntity(model));
    }

    @Override
    public CustomPage<RefrigeratorModel> findBy(RefrigeratorFilterRequest filter) {
        Specification<RefrigeratorEntity> specification = new RefrigeratorSpecification(filter);

        if (filter.getSize() < 1 || filter.getSize() > properties.getMaxSize()) {
            log.error("Не верное значение размера страницы: {}. Исправлено на дефолт.", filter.getSize());
            filter.setSize(properties.getSize());

        }
        if (filter.getPage() < 1) {
            log.error("Не верное значение номера страницы: {}. Исправлено на дефолт.", filter.getPage());
            filter.setPage(properties.getNumber());

        }

        Sort.Direction sort = filter.getSort() == null ? Sort.Direction.ASC : filter.getSort();

        Page<RefrigeratorModel> result = repository.findAll(specification,
                        PageRequest.of(filter.getPage() - 1, filter.getSize(),
                                Sort.by(sort, "price")))
                .map(RefrigeratorMapper::toModel);

        return CustomPage.<RefrigeratorModel>builder()
                .sort(sort)
                .hasNext(!result.isLast())
                .page(filter.getPage())
                .size(filter.getSize())
                .items(result.getContent())
                .build();
    }
}
