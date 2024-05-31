package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные о смартфоне")
public class SmartPhoneModel extends AbstractBaseModel{

    @Schema(description = "Объем памяти")
    private Integer ram;
    @Schema(description = "Количество камер")
    private Integer numberOfCameras;

}
