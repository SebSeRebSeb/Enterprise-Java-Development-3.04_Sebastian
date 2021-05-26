package com.ironhack.EnterpriseJavaDevelopment_3_04.model;

import com.ironhack.EnterpriseJavaDevelopment_3_04.repository.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerTest {

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    public void setUp() {
        Customer c1 = new Customer("Frank Testet", Status.Gold, 112233);
        customerRepository.save(c1);
    }

    @AfterEach
    public void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    public void findCustomer() {
        List<Customer> allCustomer = customerRepository.findAll();
        assertEquals(1, allCustomer.size());
    }

    @Test
    public void findByName() {
        Customer c2 = customerRepository.findByName("Frank Testet");
        assertEquals(c2.getMileage(), 112233);
    }

    @Test
    void findByStatus() {
        Customer testCustomer = customerRepository.findByStatus(Status.Gold);
        assertEquals(112233, testCustomer.getMileage());
    }

}