package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "refrigerators")
public class RefrigeratorEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * Количество дверей
     */
    private Integer numberOfDoors;

    /**
     * Тип компрессора
     */
    private String compressorType;

}
