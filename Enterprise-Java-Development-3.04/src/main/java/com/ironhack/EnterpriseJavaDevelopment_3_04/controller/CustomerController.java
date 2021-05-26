package com.ironhack.EnterpriseJavaDevelopment_3_04.controller;

import com.ironhack.EnterpriseJavaDevelopment_3_04.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
}
