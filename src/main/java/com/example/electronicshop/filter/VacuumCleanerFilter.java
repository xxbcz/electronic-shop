package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Фильтр по персональным компьютерам")
public class VacuumCleanerFilter extends AbstractBaseFilter {

    @Schema(description = "Объем пылесборника")
    private Double volumeOfVacuum;
    @Schema(description = "Количество режимов работы")
    private Integer numberOfModes;

}
