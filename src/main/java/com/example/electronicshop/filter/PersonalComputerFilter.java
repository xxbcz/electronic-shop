package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Фильтр по персональным компьютерам")
public class PersonalComputerFilter extends AbstractBaseFilter {

    @Schema(description = "Категория компьютера")
    private String category;

    @Schema(description = "Тип процессора")
    private String processorType;

}
