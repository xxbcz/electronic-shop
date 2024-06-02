package com.example.electronicshop.mapper;

import com.example.electronicshop.entity.PersonalComputerEntity;
import com.example.electronicshop.model.PersonalComputerModel;
import com.example.electronicshop.type.ProductType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PersonalComputerMapper {
    public static PersonalComputerEntity toEntity(PersonalComputerModel model) {
        PersonalComputerEntity entity = new PersonalComputerEntity();
        entity.setModel(model.getModel());
        entity.setProductType(ProductType.PERSONAL_COMPUTER);
        entity.setFullDescriptionType(
                entity.getProductType().getValue() + " " + model.getBrand() + " " + model.getModel());
        entity.setCategory(model.getCategory());
        entity.setProcessorType(model.getProcessorType());
        entity.setBrand(model.getBrand());
        entity.setColor(model.getColor());
        entity.setInStock(model.getInStock());
        entity.setIsOnlineOrder(model.getIsOnlineOrder());
        entity.setPrice(model.getPrice());
        entity.setManufacturingCountry(model.getManufacturingCountry());
        entity.setSerialNumber(model.getSerialNumber());
        entity.setIsInstallmentPurchasing(model.getIsInstallmentPurchasing());
        entity.setSize(model.getSize());
        return entity;
    }

    public static PersonalComputerModel toModel(PersonalComputerEntity entity) {
        PersonalComputerModel model = new PersonalComputerModel();
        model.setModel(entity.getModel());
        model.setFullDescriptionType(entity.getFullDescriptionType());
        model.setCategory(entity.getCategory());
        model.setProcessorType(entity.getProcessorType());
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
