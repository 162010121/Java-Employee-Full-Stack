package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.EmployeeEntity;

public interface EmployeeService {

	public EmployeeEntity saveDetails(EmployeeEntity entity);

	public EmployeeEntity updateDetails(EmployeeEntity entity,int Id);

	public EmployeeEntity getEmployee(int Id);

	public void deleteEmployee(int Id);

	public List<EmployeeEntity> getAllEmployee();

}
