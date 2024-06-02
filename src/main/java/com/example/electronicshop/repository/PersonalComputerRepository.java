package com.example.electronicshop.repository;

import com.example.electronicshop.entity.PersonalComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonalComputerRepository extends JpaRepository<PersonalComputerEntity, Long>,
        JpaSpecificationExecutor<PersonalComputerEntity> {

}