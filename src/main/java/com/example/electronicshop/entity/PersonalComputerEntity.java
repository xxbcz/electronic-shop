package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "personal_computers")
public class PersonalComputerEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * Категория
     */
    private String category;

    /**
     * Тип процессора
     */
    private String processorType;

}
