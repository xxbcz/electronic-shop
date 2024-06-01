package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "smartphones")
public class SmartphoneEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * Объем памяти
     */
    private Integer ram;

    /**
     * Количество камер
     */
    private Integer numberOfCameras;

}
