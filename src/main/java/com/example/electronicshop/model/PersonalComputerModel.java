package com.example.electronicshop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные о персональном компьютере")
public class PersonalComputerModel extends AbstractBaseModel {

    @Schema(description = "Категория компьютера")
    private String category;

    @Schema(description = "Тип процессора")
    private String processorType;

}
