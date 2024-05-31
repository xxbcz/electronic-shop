package com.example.electronicshop.repository;

import com.example.electronicshop.entity.SmartphoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends JpaRepository<SmartphoneEntity, Long>,
        JpaSpecificationExecutor<SmartphoneEntity> {
}
