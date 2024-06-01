package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "personal_computers")
public class PersonalComputerEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Категория
     */
    @Column(name = "category")
    private String category;

    /**
     * Тип процессора
     */
    @Column(name = "processor_type")
    private String processorType;

}
