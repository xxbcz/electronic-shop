package com.example.electronicshop.repository;

import com.example.electronicshop.entity.RefrigeratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RefrigeratorRepository extends JpaRepository<RefrigeratorEntity, Long>,
        JpaSpecificationExecutor<RefrigeratorEntity> {
}
