package com.example.electronicshop.model;

import com.example.electronicshop.type.ProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
abstract public class AbstractBaseModel {

    @Schema(name = "Идентификатор товара")
    private BigDecimal id;

    @Schema(name = "Наименование товара")
    private ProductType productType;

    @Schema(name = "Страна производитель")
    private String manufacturingCountry;

    @Schema(name = "Фирма производитель")
    private String brand;

    @Schema(name = "Возможность покупки онлайн")
    private Boolean isOnlineOrder;

    @Schema(name = "Возможность покупки в рассрочку")
    private Boolean isInstallmentPurchasing;

    @Schema(name = "Серийный номер")
    private String serialNumber;

    @Schema(name = "Цвет товара")
    private String color;

    @Schema(name = "Размер товара")
    private String size;

    @Schema(name = "Цена товара")
    private String price;

    @Schema(name = "Наличие товара")
    private Boolean inStock;
}
