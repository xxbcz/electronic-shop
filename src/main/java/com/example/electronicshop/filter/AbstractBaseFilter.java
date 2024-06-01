package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AbstractBaseFilter {

    @Schema(description = "Страна производитель")
    private String manufacturingCountry;

    @Schema(description = "Фирма производитель")
    private String brand;

    @Schema(description = "Возможность покупки онлайн")
    private Boolean isOnlineOrder;

    @Schema(description = "Возможность покупки в рассрочку")
    private Boolean isInstallmentPurchasing;

    @Schema(description = "Серийный номер")
    private String serialNumber;

    @Schema(description = "Цвет товара")
    private String color;

    @Schema(description = "Наличие товара")
    private Boolean inStock;

    @Schema(description = "Цена товара от")
    private Double priceFrom;

    @Schema(description = "Цена товара до")
    private Double priceTo;

    @Schema(description = "Полное наименование")
    private String fullDescriptionType;

    @Schema(description = "Модель товара")
    private String model;

}
