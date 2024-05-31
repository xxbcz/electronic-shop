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
public class SmartphoneEntity extends AbstractElectronicEntity{

    /**
     * Объем памяти
     */
    private Integer ram;
    /**
     * Количество камер
     */
    private Integer numberOfCameras;
}
