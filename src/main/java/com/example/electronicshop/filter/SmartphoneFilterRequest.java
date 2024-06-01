package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Запрос на поиск смартфонов")
public class SmartphoneFilterRequest extends AbstractFilter {

    @Schema(description = "Фильтр на поиск")
    private SmartphoneFilter filter;

}
