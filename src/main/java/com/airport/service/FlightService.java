package com.airport.service;

import com.airport.model.Flight;
import com.airport.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }
}
