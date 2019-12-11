package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.domain.OfficialDetails;

@Repository
public interface OfficialDetailsRepository extends MongoRepository<OfficialDetails, String>{

}
