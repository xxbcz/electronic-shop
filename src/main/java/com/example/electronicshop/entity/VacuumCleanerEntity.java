package com.example.electronicshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vacuum_cleaners")
public class VacuumCleanerEntity extends AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Обьем пылесборника
     */
    @Column(name = "volume_of_vacuum")
    private Double volumeOfVacuum;

    /**
     * Количество режимов работы
     */
    @Column(name = "number_of_modes")
    private Integer numberOfModes;

}
