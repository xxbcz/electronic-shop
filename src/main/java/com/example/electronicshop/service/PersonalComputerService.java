package com.example.electronicshop.service;

import com.example.electronicshop.filter.PersonalComputerFilterRequest;
import com.example.electronicshop.model.PersonalComputerModel;
import com.example.electronicshop.model.page.CustomPage;

public interface PersonalComputerService {

    /**
     * Поиск пылесоса/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<PersonalComputerModel> findBy(PersonalComputerFilterRequest filter);

    /**
     * Добавление пылесоса
     */
    void addPersonalComputer(PersonalComputerModel model);

}
