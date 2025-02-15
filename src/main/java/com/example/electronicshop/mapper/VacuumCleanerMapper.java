package com.example.electronicshop.mapper;

import com.example.electronicshop.entity.VacuumCleanerEntity;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.type.ProductType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class VacuumCleanerMapper {
    public static VacuumCleanerEntity toEntity(VacuumCleanerModel model) {
        VacuumCleanerEntity entity = new VacuumCleanerEntity();
        entity.setModel(model.getModel());
        entity.setProductType(ProductType.VACUUM_CLEANER);
        entity.setFullDescriptionType(
                entity.getProductType().getValue() + " " + model.getBrand() + " " + model.getModel());
        entity.setNumberOfModes(model.getNumberOfModes());
        entity.setVolumeOfVacuum(model.getVolumeOfVacuum());
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

    public static VacuumCleanerModel toModel(VacuumCleanerEntity entity) {
        VacuumCleanerModel model = new VacuumCleanerModel();
        model.setModel(entity.getModel());
        model.setFullDescriptionType(entity.getFullDescriptionType());
        model.setNumberOfModes(entity.getNumberOfModes());
        model.setVolumeOfVacuum(entity.getVolumeOfVacuum());
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
