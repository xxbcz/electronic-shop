package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "refrigerators")
public class RefrigeratorEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Количество дверей
     */
    @Column(name = "Количество дверей")
    private Integer numberOfDoors;

    /**
     * Тип компрессора
     */
    @Column(name = "Тип компрессора")
    private String compressorType;

}
