package com.example.electronicshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "bank_account")
@NoArgsConstructor
@AllArgsConstructor
public class TvEntity extends AbstractElectronicEntity{

    /**
     * Категория
     */
    private String category;
    /**
     * Технология изготовления
     */
    private String technology;
}
