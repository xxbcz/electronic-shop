package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные о пылесосе")
public class VacuumCleanerModel extends AbstractBaseModel{

    @Schema(description = "Объем пылесборника")
    private Double volumeOfVacuum;
    @Schema(description = "Количество режимов работы")
    private Integer numberOfModes;

}
