package com.example.electronicshop.model;

import com.example.electronicshop.type.ProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
abstract public class AbstractBaseModel {

    @Schema(description = "Наименование товара")
    private ProductType productType;

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

    @Schema(description = "Размер товара")
    private String size;

    @Schema(description = "Цена товара")
    private Double price;

    @Schema(description = "Наличие товара")
    private Boolean inStock;

    @Schema(description = "Полное наименование")
    private String fullDescriptionType;

    @Schema(description = "Модель товара")
    private String model;
}
