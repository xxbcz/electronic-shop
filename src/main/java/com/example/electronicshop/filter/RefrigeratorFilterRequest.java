package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Запрос на поиск холодильников")
public class RefrigeratorFilterRequest {

    @Schema(description = "Фильтр на поиск")
    private RefrigeratorFilter filter;

}
