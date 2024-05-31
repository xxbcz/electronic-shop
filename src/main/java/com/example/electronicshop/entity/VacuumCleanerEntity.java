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
public class VacuumCleanerEntity extends AbstractElectronicEntity{

    /**
     * Обьем пылесборника
     */
    private String volumeOfVacuum;

    /**
     * Количество режимов работы
     */
    private Integer numberOfModes;

}
