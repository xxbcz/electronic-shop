package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные о смартфоне")
public class SmartphoneModel extends AbstractBaseModel{

    @Schema(description = "Объем памяти")
    private Integer memory;
    @Schema(description = "Количество камер")
    private Integer numberOfCameras;

}
