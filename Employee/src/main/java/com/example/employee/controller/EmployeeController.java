package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.domain.EmployeeDetails;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("employee/save")
	public EmployeeDetails saveEmployee(@RequestBody EmployeeDetails employee) {
		return service.saveEmployee(employee);
	}
}
