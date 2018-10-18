package com.victor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.victor.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@ResponseBody
	@RequestMapping("/customer/{id}")
    public  String getCustomerById(@PathVariable("id") String id) {
    	return customerService.getCustomerById(id);
	}	 
	
	
 
}
