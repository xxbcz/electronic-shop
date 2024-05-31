package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Запрос на поиск персональных компьютеров")
public class PersonalComputerFilterRequest extends AbstractFilter {

    @Schema(description = "Фильтр на поиск")
    private PersonalComputerFilter filter;

}
