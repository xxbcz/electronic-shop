package com.example.electronicshop.mapper;

import com.example.electronicshop.entity.SmartphoneEntity;
import com.example.electronicshop.model.SmartphoneModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SmartphoneMapper {
    public static SmartphoneEntity toEntity(SmartphoneModel model) {
        SmartphoneEntity entity = new SmartphoneEntity();
        entity.setId(model.getId());
        entity.setModel(model.getModel());
        entity.setFullDescriptionType(
                model.getProductType().getValue() + " " + model.getBrand() + " " + model.getModel());
        entity.setMemory(model.getMemory());
        entity.setNumberOfCameras(model.getNumberOfCameras());
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

    public static SmartphoneModel toModel(SmartphoneEntity entity) {
        SmartphoneModel model = new SmartphoneModel();
        model.setModel(entity.getModel());
        model.setFullDescriptionType(entity.getFullDescriptionType());
        model.setId(entity.getId());
        model.setMemory(entity.getMemory());
        model.setNumberOfCameras(entity.getNumberOfCameras());
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
