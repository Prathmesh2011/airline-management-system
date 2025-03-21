package com.example.airline_management_system.service;

import com.example.airline_management_system.dto.FlightDTO;
import com.example.airline_management_system.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<FlightDTO> getAllFlights(String sort) {
        return flightRepository.getAllFlights(sort);
    }
}
