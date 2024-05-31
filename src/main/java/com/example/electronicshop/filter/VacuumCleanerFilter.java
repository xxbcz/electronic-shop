package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фильтр по персональным компьютерам")
public class VacuumCleanerFilter {

    @Schema(description = "Объем пылесборника")
    private String volumeOfVacuum;
    @Schema(description = "Количество режимов работы")
    private Integer numberOfModes;

}
