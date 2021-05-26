package com.ironhack.EnterpriseJavaDevelopment_3_04.repository;

import com.ironhack.EnterpriseJavaDevelopment_3_04.model.Customer;
import com.ironhack.EnterpriseJavaDevelopment_3_04.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByName(String name);

    Customer findByStatus(Status status);
}
