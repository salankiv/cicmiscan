package com.salankiv.cicmiscanner.service;

import com.salankiv.cicmiscanner.repository.IataAirlineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirlineFinder {

    @Autowired
    IataAirlineRepo iataAirlineRepo;

    public String findAirline(String iata) {
        return iataAirlineRepo.findByIata(iata).getAirline();
    }
}
