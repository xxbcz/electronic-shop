package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "smartphones")
public class SmartphoneEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Объем памяти
     */
    @Column(name = "memory")
    private Integer memory;

    /**
     * Количество камер
     */
    @Column(name = "number_of_cameras")
    private Integer numberOfCameras;

}
