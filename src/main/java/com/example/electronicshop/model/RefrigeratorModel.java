package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные о холодильнике")
public class RefrigeratorModel extends AbstractBaseModel{

    @Schema(description = "Количество дверей")
    private Integer numberOfDoors;
    @Schema(description = "Тип компрессора")
    private String compressorType;

}
