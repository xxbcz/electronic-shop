package com.example.electronicshop.mapper;

import com.example.electronicshop.entity.TvEntity;
import com.example.electronicshop.model.TvModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TvMapper {
    public static TvEntity toEntity(TvModel model) {
        TvEntity entity = new TvEntity();
        entity.setId(model.getId());
        entity.setModel(model.getModel());
        entity.setFullDescriptionType(
                model.getProductType().getValue() + " " + model.getBrand() + " " + model.getModel());
        entity.setCategory(model.getCategory());
        entity.setTechnology(model.getTechnology());
        entity.setBrand(model.getBrand());
        entity.setColor(model.getColor());
        entity.setInStock(model.getInStock());
        entity.setIsOnlineOrder(model.getIsOnlineOrder());
        entity.setPrice(model.getPrice());
        entity.setManufacturingCountry(model.getManufacturingCountry());
        entity.setProductType(model.getProductType());
        entity.setSerialNumber(model.getSerialNumber());
        entity.setIsInstallmentPurchasing(model.getIsInstallmentPurchasing());
        entity.setSize(model.getSize());
        return entity;
    }

    public static TvModel toModel(TvEntity entity) {
        TvModel model = new TvModel();
        model.setModel(entity.getModel());
        model.setFullDescriptionType(entity.getFullDescriptionType());
        model.setId(entity.getId());
        model.setCategory(entity.getCategory());
        model.setTechnology(entity.getTechnology());
        model.setBrand(entity.getBrand());
        model.setColor(entity.getColor());
        model.setInStock(entity.getInStock());
        model.setIsOnlineOrder(entity.getIsOnlineOrder());
        model.setPrice(entity.getPrice());
        model.setManufacturingCountry(entity.getManufacturingCountry());
        model.setProductType(entity.getProductType());
        model.setSerialNumber(entity.getSerialNumber());
        model.setIsInstallmentPurchasing(entity.getIsInstallmentPurchasing());
        model.setSize(entity.getSize());

        return model;
    }
}
