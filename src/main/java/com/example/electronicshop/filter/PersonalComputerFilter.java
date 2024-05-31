package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фильтр по персональным компьютерам")
public class PersonalComputerFilter extends AbstractBaseFilter {

    @Schema(description = "Категория компьютера")
    private String category;

    @Schema(description = "Тип процессора")
    private String processorType;

}
