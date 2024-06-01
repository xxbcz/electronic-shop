package com.example.electronicshop.type;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(description = "Типы товаров")
@Getter
@RequiredArgsConstructor
public enum ProductType {

    @Schema(description = "Смартфон")
    SMARTPHONE("Смартфон"),
    @Schema(description = "Холодильник")
    REFRIGERATOR("Холодильник"),
    @Schema(description = "Персональный компьютер")
    PERSONAL_COMPUTER("Персональный компьютер"),
    @Schema(description = "Пылесос")
    VACUUM_CLEANER("Пылесос"),
    @Schema(description = "Телевизор")
    TV("Телевизор");

    private final String value;
}
