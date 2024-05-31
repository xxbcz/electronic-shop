package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Запрос на поиск телевизоров")
public class TvFilterRequest {

    @Schema(description = "Фильтр на поиск")
    private TVFilter filter;

}
