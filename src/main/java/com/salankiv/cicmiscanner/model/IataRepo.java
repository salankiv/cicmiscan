package com.salankiv.cicmiscanner.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IataRepo extends CrudRepository<Iata, String> {

  //  List<Iata> findAllByAirport();

    List<Iata> findAll();

  //  List<Iata> findAllByOriginIsNotNull();

  //  Iata findByIata(String iata);
}