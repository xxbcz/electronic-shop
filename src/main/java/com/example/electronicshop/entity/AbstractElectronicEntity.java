package com.example.electronicshop.entity;

import com.example.electronicshop.type.ProductType;
import lombok.Data;

import javax.persistence.*;


/**
 * Базовый класс для товаров
 */

@Data
@MappedSuperclass
public abstract class AbstractElectronicEntity {

    /**
     * Наименование
     */
    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    /**
     * Полное наименование
     */
    @Column(name = "full_description_type")
    private String fullDescriptionType;

    /**
     * Страна-производитель
     */
    @Column(name = "manufacturing_country")
    private String manufacturingCountry;

    /**
     * Фирма-производитель
     */
    @Column(name = "brand")
    private String brand;

    /**
     * Возможность покупки онлайн
     */
    @Column(name = "is_online_order")
    private Boolean isOnlineOrder;

    /**
     * Возможность покупки в рассрочку
     */
    @Column(name = "is_installment_purchasing")
    private Boolean isInstallmentPurchasing;

    /**
     * Серийный номер
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * Цвет товара
     */
    @Column(name = "color")
    private String color;

    /**
     * Размер товара
     */
    @Column(name = "size")
    private String size;

    /**
     * Цена товара
     */
    @Column(name = "price")
    private Double price;
    /**
     * Наличие товара
     */
    @Column(name = "in_stock")
    private Boolean inStock;

    /**
     * Модель товара
     */
    @Column(name = "model")
    private String model;


}
