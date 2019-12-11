package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employee.domain.EmployeeDetails;
import com.example.employee.repository.EmployeeDetailsRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDetailsRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	public EmployeeDetails saveEmployee(EmployeeDetails employee) {
		return repo.save(employee);
	}
}
