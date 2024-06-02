package com.example.electronicshop.model.page;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
@Builder
public class CustomPage<T> {

    @Schema(description = "Номер страницы (нумерация с 1)")
    private int page;
    @Schema(description = "Количество пользователей на странице")
    private int size;
    @Schema(description = "Есть ли следующая страница")
    private boolean hasNext;
    @Schema(description = "Направление сортировки")
    private Sort.Direction sort;
    @Schema(description = "Список возвращаемых пользователей")
    private List<T> items;

}
