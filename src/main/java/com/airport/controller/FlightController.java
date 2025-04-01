package com.airport.controller;

import com.airport.model.Flight;
import com.airport.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    // ✅ Get all flights
    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    // ✅ Admin: Add a new flight
    @PostMapping("/add")
    public ResponseEntity<String> addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
        return ResponseEntity.ok("Flight added successfully!");
    }
}
