package com.ironhack.EnterpriseJavaDevelopment_3_04.model;

import com.ironhack.EnterpriseJavaDevelopment_3_04.repository.AircraftRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircraftTest {
    @Autowired
    private AircraftRepository aircraftRepository;

    @BeforeEach
    public void setUp(){
        Aircraft a1 = new Aircraft("B117",112);
        aircraftRepository.save(a1);
    }
    @AfterEach
    public void tearDown(){
        aircraftRepository.deleteAll();
    }
    @Test
    public void findAircraft(){
        List<Aircraft> allAircrafts = aircraftRepository.findAll();
        assertEquals(1,allAircrafts.size());
    }

    @Test
    public void findAircraftContain(){
        Aircraft a2 = aircraftRepository.findByModelContaining("B");
        assertEquals(112,a2.getSeats());
    }


}