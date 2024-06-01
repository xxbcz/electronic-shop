package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tv")
public class TvEntity extends AbstractElectronicEntity {

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
     * Технология изготовления
     */
    @Column(name = "technology")
    private String technology;
}
