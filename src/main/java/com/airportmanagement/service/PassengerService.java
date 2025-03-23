package com.airportmanagement.service;

import com.airportmanagement.model.Passenger;
import com.airportmanagement.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Optional<Passenger> getPassengerById(Long id) {
        return passengerRepository.findById(id);
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Passenger updatePassenger(Long id, Passenger passengerDetails) {
        Passenger passenger = passengerRepository.findById(id).orElseThrow(() -> new RuntimeException("Passenger not found"));
        passenger.setName(passengerDetails.getName());
        passenger.setAge(passengerDetails.getAge());
        passenger.setGender(passengerDetails.getGender());
        passenger.setPassportNumber(passengerDetails.getPassportNumber());
        passenger.setNationality(passengerDetails.getNationality());
        passenger.setContactNumber(passengerDetails.getContactNumber());
        return passengerRepository.save(passenger);
    }

    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}
