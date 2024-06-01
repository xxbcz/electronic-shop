package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.entity.PersonalComputerEntity;
import com.example.electronicshop.filter.PersonalComputerFilterRequest;
import com.example.electronicshop.mapper.PersonalComputerMapper;
import com.example.electronicshop.model.PersonalComputerModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.repository.PersonalComputerRepository;
import com.example.electronicshop.service.PersonalComputerService;
import com.example.electronicshop.specification.PersonalComputerSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonalComputerServiceImpl implements PersonalComputerService {
    private final PersonalComputerRepository repository;
    private final PageProperties properties;

    @Override
    public void addPersonalComputer(PersonalComputerModel model) {
        repository.save(PersonalComputerMapper.toEntity(model));
    }

    @Override
    public CustomPage<PersonalComputerModel> findBy(PersonalComputerFilterRequest filter) {
        Specification<PersonalComputerEntity> snowboardSpecification = new PersonalComputerSpecification(filter);

        if (filter.getSize() < 1 || filter.getSize() > properties.getMaxSize()) {
            log.error("Не верное значение размера страницы: {}. Исправлено на дефолт.", filter.getSize());
            filter.setSize(properties.getSize());

        }
        if (filter.getPage() < 1) {
            log.error("Не верное значение номера страницы: {}. Исправлено на дефолт.", filter.getPage());
            filter.setPage(properties.getNumber());

        }

        Sort.Direction sort = filter.getSort() == null ? Sort.Direction.ASC : filter.getSort();

        Page<PersonalComputerModel> result = repository.findAll(snowboardSpecification,
                        PageRequest.of(filter.getPage() - 1, filter.getSize(),
                                Sort.by(sort, "price")))
                .map(PersonalComputerMapper::toModel);

        return CustomPage.<PersonalComputerModel>builder()
                .sort(sort)
                .hasNext(!result.isLast())
                .page(filter.getPage())
                .size(filter.getSize())
                .items(result.getContent())
                .build();
    }
}
