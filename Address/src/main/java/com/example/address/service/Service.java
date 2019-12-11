package com.example.address.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.address.domain.Address;
import com.example.address.repository.AddressRepository;

public class Service {

	@Autowired
	AddressRepository repo;
	
	public Address saveAddress(Address address) {
		return repo.save(address);
	}
}
