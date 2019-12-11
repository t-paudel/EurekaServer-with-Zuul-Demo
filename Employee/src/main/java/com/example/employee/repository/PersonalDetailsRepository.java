package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.domain.PersonalDetails;

@Repository
public interface PersonalDetailsRepository extends MongoRepository<PersonalDetails, String> {

}
