package com.example.electronicshop.entity;

import com.example.electronicshop.type.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Базовый класс для товаров
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractElectronicEntity {

    /**
     * Идентификатор
     */
    @Id
    private BigDecimal id;

    /**
     * Наименование
     */
    private ProductType productType;

    /**
     * Страна-производитель
     */
    private String manufacturingCountry;

    /**
     * Фирма-производитель
     */
    private String brand;

    /**
     * Возможность покупки онлайн
     */
    private Boolean isOnlineOrder;

    /**
     * Возможность покупки в рассрочку
     */
    private Boolean isInstallmentPurchasing;

    /**
     * Серийный номер
     */
    private String serialNumber;

    /**
     * Цвет товара
     */
    private String color;

    /**
     * Размер товара
     */
    private String size;

    /**
     * Цена товара
     */
    private String price;
    /**
     * Наличие товара
     */
    private Boolean inStock;
}
