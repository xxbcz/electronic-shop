package com.example.electronicshop.service;

import com.example.electronicshop.filter.VacuumCleanerFilterRequest;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.model.page.CustomPage;

public interface VacuumCleanerService {
    /**
     * Поиск пылесоса/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<VacuumCleanerModel> findBy(VacuumCleanerFilterRequest filter);

    /**
     * Добавление пылесоса
     */
    void addVacuumCleaner(VacuumCleanerModel model);
}
