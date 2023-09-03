package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.EmployeeEntity;
import com.emp.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "employee/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<EmployeeEntity> registerEmployee(@RequestBody  EmployeeEntity entity) {
		EmployeeEntity entity2 = service.saveDetails(entity);
		return new ResponseEntity<>(entity2, HttpStatus.CREATED);

	}

	@PostMapping("/upateEmployee/{Id}")
	public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity entity,@PathVariable  Integer Id) {
		EmployeeEntity entity2 = service.saveDetails(entity);
		return new ResponseEntity<>(entity2, HttpStatus.OK);

	}

	@GetMapping("/getEmployee/{Id}")
	public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable("Id") Integer Id)

	{
		EmployeeEntity eEntity = service.getEmployee(Id);

		return new ResponseEntity<>(eEntity, HttpStatus.OK);

	}

	@DeleteMapping("/deleteEmployee/{Id}")
	public void deleteEmployee(@PathVariable("Id") Integer Id) {
		service.deleteEmployee(Id);
	}

	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<EmployeeEntity>> getAll() {

		List<EmployeeEntity> entities = service.getAllEmployee();

		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

}
