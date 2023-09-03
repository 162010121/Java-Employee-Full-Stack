package com.emp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.emp.entity.EmployeeEntity;
import com.emp.repo.EmployeeRepo;
import com.emp.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public EmployeeEntity saveDetails(EmployeeEntity entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}
	@Override
	public EmployeeEntity getEmployee(int Id) {
		return repo.findById(Id).get();
		
	}
	@Override
	public void deleteEmployee(int Id) {
		// TODO Auto-generated method stub
		repo.deleteById(Id);
		
	}
	public List<EmployeeEntity> getAllEmployee() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}
	@Override
	public EmployeeEntity updateDetails(EmployeeEntity entity,int Id) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	
	

}
