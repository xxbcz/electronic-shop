package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.entity.VacuumCleanerEntity;
import com.example.electronicshop.filter.VacuumCleanerFilterRequest;
import com.example.electronicshop.mapper.VacuumCleanerMapper;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.repository.VacuumCleanerRepository;
import com.example.electronicshop.service.VacuumCleanerService;
import com.example.electronicshop.specification.VacuumCleanerSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VacuumCleanerServiceImpl implements VacuumCleanerService {
    private final VacuumCleanerRepository repository;
    private final PageProperties properties;

    @Override
    public void addVacuumCleaner(VacuumCleanerModel model) {
        repository.save(VacuumCleanerMapper.toEntity(model));
    }

    @Override
    public CustomPage<VacuumCleanerModel> findBy(VacuumCleanerFilterRequest filter) {
        Specification<VacuumCleanerEntity> specification = new VacuumCleanerSpecification(filter);

        if (filter.getSize() < 1 || filter.getSize() > properties.getMaxSize()) {
            filter.setSize(properties.getSize());

        }
        if (filter.getPage() < 1) {
            filter.setPage(properties.getNumber());

        }

        Sort.Direction sort = filter.getSort() == null ? Sort.Direction.ASC : filter.getSort();

        Page<VacuumCleanerModel> result = repository.findAll(specification,
                        PageRequest.of(filter.getPage() - 1, filter.getSize(),
                                Sort.by(sort, "price")))
                .map(VacuumCleanerMapper::toModel);

        return CustomPage.<VacuumCleanerModel>builder()
                .sort(sort)
                .hasNext(!result.isLast())
                .page(filter.getPage())
                .size(filter.getSize())
                .items(result.getContent())
                .build();
    }
}
