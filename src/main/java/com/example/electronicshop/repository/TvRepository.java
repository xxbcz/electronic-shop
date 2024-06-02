package com.example.electronicshop.repository;

import com.example.electronicshop.entity.TvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TvRepository extends JpaRepository<TvEntity, Long>,
        JpaSpecificationExecutor<TvEntity> {
}
