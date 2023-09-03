package com.emp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "employee")
@Data
@Entity
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer Id;
	
	@Column(name = "fristName")
	private String fristName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="deparment")
	private String department;
	
	@Column(name="action")
	private String action;
	
}
