package com.ironhack.EnterpriseJavaDevelopment_3_04.model;

import com.ironhack.EnterpriseJavaDevelopment_3_04.repository.AircraftRepository;
import com.ironhack.EnterpriseJavaDevelopment_3_04.repository.FlightRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightTest {
    @Autowired
    private FlightRepository flightRepository;
    private AircraftRepository aircraftRepository;

    @BeforeEach
    public void setUp(){
        Aircraft a1 = new Aircraft("B777",123);
        aircraftRepository.save(a1);
        Flight f1 = new Flight("dd", 22223334L,a1.getModel());
        flightRepository.save(f1);
    }
    @AfterEach
    public void tearDown(){
        aircraftRepository.deleteAll();
        flightRepository.deleteAll();
    }
    @Test
    public void findFlights(){
        List<Flight> allFlights= flightRepository.findAll();
        assertEquals(1,allFlights.size());
    }
//    @Test
//    public void findFlightsByNumber(){
//        Flight f2 = flightRepository.findByNumber("dd");
//        assertEquals(22223334L, f2.getMileage());
//    }
//    @Test
//    public void findFlightGreater(){
//        List<Flight> allFlights2= flightRepository.findAllByMileageGreaterThan(500);
//        assertTrue(allFlights2.size()==1);
//    }



}