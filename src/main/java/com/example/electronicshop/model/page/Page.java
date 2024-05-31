package com.example.electronicshop.model.page;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Page<T> {

    @Schema(description = "Номер страницы (нумерация с 1)")
    private int page;
    @Schema(description = "Количество пользователей на странице")
    private int size;
    @Schema(description = "Есть ли следующая страница")
    private boolean hasNext;
    @Schema(description = "Список возвращаемых пользователей")
    private List<T> items;

}
