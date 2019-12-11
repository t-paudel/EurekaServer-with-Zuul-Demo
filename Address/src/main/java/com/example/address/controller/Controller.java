package com.example.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.address.domain.Address;
import com.example.address.service.Service;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	public Address saveAddress(@RequestBody Address address) {
		return service.saveAddress(address);
	}
}
