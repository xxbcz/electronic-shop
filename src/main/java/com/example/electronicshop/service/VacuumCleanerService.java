package com.example.electronicshop.service;

import com.example.electronicshop.filter.VacuumCleanerFilterRequest;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.model.page.Page;

public interface VacuumCleanerService {
    /**
     * Поиск пользователя с использованием фильтров/сортировки/пагинации
     */
    Page<VacuumCleanerModel> findBy(VacuumCleanerFilterRequest filter);
}
