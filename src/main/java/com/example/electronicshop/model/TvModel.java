package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные о телевизоре")
public class TvModel extends AbstractBaseModel{

    @Schema(description = "Категория телевизора")
    private String category;
    @Schema(description = "Технология изготовления")
    private String technology;

}
