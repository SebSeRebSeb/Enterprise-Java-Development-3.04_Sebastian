package com.ironhack.EnterpriseJavaDevelopment_3_04.repository;

import com.ironhack.EnterpriseJavaDevelopment_3_04.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight,String> {
    Flight findByNumber(String number);
    List<Flight> findAllByMileageGreaterThan(Long i);
}
