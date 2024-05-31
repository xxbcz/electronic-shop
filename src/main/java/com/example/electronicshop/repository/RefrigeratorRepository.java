package com.example.electronicshop.repository;

import com.example.electronicshop.entity.RefrigeratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RefrigeratorRepository extends JpaRepository<RefrigeratorEntity, Long>,
        JpaSpecificationExecutor<RefrigeratorEntity> {
}
