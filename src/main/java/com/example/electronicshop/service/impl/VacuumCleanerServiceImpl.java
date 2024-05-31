package com.example.electronicshop.service.impl;

import com.example.electronicshop.config.PageProperties;
import com.example.electronicshop.filter.VacuumCleanerFilterRequest;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.model.page.Page;
import com.example.electronicshop.repository.VacuumCleanerRepository;
import com.example.electronicshop.service.VacuumCleanerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VacuumCleanerServiceImpl implements VacuumCleanerService {
    private final VacuumCleanerRepository repository;
    private final PageProperties properties;

    @Override
    public Page<VacuumCleanerModel> findBy(VacuumCleanerFilterRequest filter) {
        return null;
    }
}
