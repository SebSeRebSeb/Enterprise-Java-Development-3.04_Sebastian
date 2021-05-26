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
    @Autowired
    private AircraftRepository aircraftRepository;

    @BeforeEach
    public void setUp(){
        Aircraft a1 = aircraftRepository.save(new Aircraft("Airbus A380", 500));
        Flight f1 = new Flight("L994", 444553L, a1.getModel());
        flightRepository.save(f1);
    }

    @AfterEach
    public void tearDown() {
        flightRepository.deleteAll();
        aircraftRepository.deleteAll();
    }

    @Test
    public void findFlights(){
        List<Flight> allFlights= flightRepository.findAll();
        assertEquals(1,allFlights.size());
    }

    @Test
    public void findByNumber(){
        Flight flight = flightRepository.findByNumber("L994");
        assertEquals(flight.getMileage(),444553L);
    }


        @Test
    public void findFlightGreater(){
        List<Flight> allFlights2= flightRepository.findAllByMileageGreaterThan(500L);
        assertTrue(allFlights2.size()==1);
    }
}