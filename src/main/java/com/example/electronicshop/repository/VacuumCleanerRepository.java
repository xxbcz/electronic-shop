package com.example.electronicshop.repository;

import com.example.electronicshop.entity.VacuumCleanerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VacuumCleanerRepository extends JpaRepository<VacuumCleanerEntity, Long>,
        JpaSpecificationExecutor<VacuumCleanerEntity> {
}
