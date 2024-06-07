package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.entity.TvEntity;
import com.example.electronicshop.filter.TvFilterRequest;
import com.example.electronicshop.mapper.TvMapper;
import com.example.electronicshop.model.TvModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.repository.TvRepository;
import com.example.electronicshop.service.TvService;
import com.example.electronicshop.specification.TvSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TvServiceImpl implements TvService {
    private final TvRepository repository;
    private final PageProperties properties;

    @Override
    public void addTv(TvModel model) {
        repository.save(TvMapper.toEntity(model));
    }

    @Override
    public CustomPage<TvModel> findBy(TvFilterRequest filter) {
        Specification<TvEntity> specification = new TvSpecification(filter);

        if (filter.getSize() < 1 || filter.getSize() > properties.getMaxSize()) {
            filter.setSize(properties.getSize());

        }
        if (filter.getPage() < 1) {
            filter.setPage(properties.getNumber());

        }

        Sort.Direction sort = filter.getSort() == null ? Sort.Direction.ASC : filter.getSort();

        Page<TvModel> result = repository.findAll(specification,
                        PageRequest.of(filter.getPage() - 1, filter.getSize(),
                                Sort.by(sort, "price")))
                .map(TvMapper::toModel);

        return CustomPage.<TvModel>builder()
                .sort(sort)
                .hasNext(!result.isLast())
                .page(filter.getPage())
                .size(filter.getSize())
                .items(result.getContent())
                .build();
    }
}
