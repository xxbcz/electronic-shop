package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные о пылесосе")
public class VacuumCleanerModel extends AbstractBaseModel{

    @Schema(description = "Объем пылесборника")
    private String volumeOfVacuum;
    @Schema(description = "Количество режимов работы")
    private Integer numberOfModes;

}
