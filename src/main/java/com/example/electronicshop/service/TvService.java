package com.example.electronicshop.service;

import com.example.electronicshop.filter.TvFilterRequest;
import com.example.electronicshop.model.TvModel;
import com.example.electronicshop.model.page.CustomPage;

public interface TvService {

    /**
     * Поиск телевизора/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<TvModel> findBy(TvFilterRequest filter);

    /**
     * Добавление телевизора
     */
    void addTv(TvModel model);

}
