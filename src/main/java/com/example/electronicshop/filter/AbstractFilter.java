package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public abstract class AbstractFilter {

    @Schema(description = "Направление сортировки")
    private Sort.Direction sort;
    @Schema(description = "Номер страницы (нумерация с 1)")
    private int page;
    @Schema(description = "Количество номеров на странице")
    private int size;


}
