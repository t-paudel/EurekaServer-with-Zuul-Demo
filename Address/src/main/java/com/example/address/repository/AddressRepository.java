package com.example.address.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.address.domain.Address;

public interface AddressRepository extends MongoRepository<Address, String>{

}
