package com.airportmanagement.service;

import com.airportmanagement.model.Flight;
import com.airportmanagement.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight updateFlight(Long id, Flight flightDetails) {
        Flight flight = flightRepository.findById(id).orElseThrow(() -> new RuntimeException("Flight not found"));
        flight.setAirline(flightDetails.getAirline());
        flight.setSource(flightDetails.getSource());
        flight.setDestination(flightDetails.getDestination());
        flight.setDepartureTime(flightDetails.getDepartureTime());
        flight.setArrivalTime(flightDetails.getArrivalTime());
        flight.setStatus(flightDetails.getStatus());
        flight.setGateNumber(flightDetails.getGateNumber());
        return flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
