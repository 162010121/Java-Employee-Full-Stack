package com.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.EmployeeEntity;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
