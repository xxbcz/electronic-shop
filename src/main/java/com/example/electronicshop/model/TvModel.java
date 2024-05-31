package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Данные о телевизоре")
public class TvModel extends AbstractBaseModel{

    @Schema(description = "Категория телевизора")
    private String category;
    @Schema(description = "Технология изготовления")
    private String technology;

}
