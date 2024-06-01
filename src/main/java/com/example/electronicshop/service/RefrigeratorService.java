package com.example.electronicshop.service;

import com.example.electronicshop.filter.PersonalComputerFilterRequest;
import com.example.electronicshop.filter.RefrigeratorFilterRequest;
import com.example.electronicshop.model.PersonalComputerModel;
import com.example.electronicshop.model.RefrigeratorModel;
import com.example.electronicshop.model.page.CustomPage;

public interface RefrigeratorService {
    /**
     * Поиск холодильника/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<RefrigeratorModel> findBy(RefrigeratorFilterRequest filter);

    /**
     * Добавление холодильника
     */
    void addRefrigerator(RefrigeratorModel model);
}
