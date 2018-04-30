package com.salankiv.cicmiscanner.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IataAirlineRepo extends CrudRepository<IataAirline, String> {

    List<IataAirline> findAll();

    IataAirline findByIata(String iata);
}
