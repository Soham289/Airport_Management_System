package com.airportmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerID;

    private String name;
    private int age;
    private String gender;
    private String passportNumber;
    private String nationality;
    private String contactNumber;
}
