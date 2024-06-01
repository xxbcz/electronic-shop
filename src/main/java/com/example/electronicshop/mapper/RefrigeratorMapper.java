package com.example.electronicshop.mapper;

import com.example.electronicshop.entity.RefrigeratorEntity;
import com.example.electronicshop.model.RefrigeratorModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RefrigeratorMapper {
    public static RefrigeratorEntity toEntity(RefrigeratorModel model) {
        RefrigeratorEntity entity = new RefrigeratorEntity();
        entity.setId(model.getId());
        entity.setModel(model.getModel());
        entity.setFullDescriptionType(
                model.getProductType().getValue() + " " + model.getBrand() + " " + model.getModel());
        entity.setCompressorType(model.getCompressorType());
        entity.setNumberOfDoors(model.getNumberOfDoors());
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

    public static RefrigeratorModel toModel(RefrigeratorEntity entity) {
        RefrigeratorModel model = new RefrigeratorModel();
        model.setModel(entity.getModel());
        model.setFullDescriptionType(entity.getFullDescriptionType());
        model.setId(entity.getId());
        model.setNumberOfDoors(entity.getNumberOfDoors());
        model.setCompressorType(entity.getCompressorType());
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
