package com.salankiv.cicmiscanner.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IataAirportRepo extends CrudRepository<IataAirport, String> {

  //  List<IataAirport> findAllByAirport();

    List<IataAirport> findAll();

  //  List<IataAirport> findAllByOriginIsNotNull();

  //  IataAirport findByIata(String iata);
}