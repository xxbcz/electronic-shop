package com.example.electronicshop.type;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Типы товаров")
public enum ProductType {
    @Schema(description = "Смартфон")
    SMARTPHONE,
    @Schema(description = "Холодильник")
    REFRIGERATOR,
    @Schema(description = "Персональный компьютер")
    PERSONAL_COMPUTER,
    @Schema(description = "Пылесос")
    VACUUM_CLEANER,
    @Schema(description = "Телевизор")
    TV
}
