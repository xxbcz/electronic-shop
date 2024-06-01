package com.example.electronicshop.service;

import com.example.electronicshop.filter.SmartphoneFilterRequest;
import com.example.electronicshop.model.SmartphoneModel;
import com.example.electronicshop.model.page.CustomPage;

public interface SmartphoneService {
    /**
     * Поиск смартфона/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<SmartphoneModel> findBy(SmartphoneFilterRequest filter);

    /**
     * Добавление смартфона
     */
    void addSmartphone(SmartphoneModel model);
}
