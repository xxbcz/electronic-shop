package com.example.electronicshop.service;

import com.example.electronicshop.filter.PersonalComputerFilterRequest;
import com.example.electronicshop.model.PersonalComputerModel;
import com.example.electronicshop.model.page.CustomPage;

public interface PersonalComputerService {

    /**
     * Поиск персонального компьютера/ов с использованием фильтров/сортировки/пагинации
     */
    CustomPage<PersonalComputerModel> findBy(PersonalComputerFilterRequest filter);

    /**
     * Добавление персонального компьютера
     */
    void addPersonalComputer(PersonalComputerModel model);

}
