package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фильтр по холодильникам")
public class RefrigeratorFilter extends AbstractBaseFilter {

    @Schema(description = "Количество дверей")
    private Integer numberOfDoors;
    @Schema(description = "Тип компрессора")
    private String compressorType;

}
