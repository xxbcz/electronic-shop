package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tv")
public class TvEntity extends AbstractElectronicEntity {
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
     * Технология изготовления
     */
    private String technology;
}
