package com.ironhack.EnterpriseJavaDevelopment_3_04.repository;

import com.ironhack.EnterpriseJavaDevelopment_3_04.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft,String> {
   Aircraft findByModelContaining(String b);
}
