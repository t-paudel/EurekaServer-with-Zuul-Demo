package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.domain.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends MongoRepository<EmployeeDetails, String> {

}
