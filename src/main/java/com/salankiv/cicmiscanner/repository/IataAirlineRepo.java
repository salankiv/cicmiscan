package com.salankiv.cicmiscanner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IataAirlineRepo extends CrudRepository<IataAirline, String> {

    List<IataAirline> findAll();

    IataAirline findByIata(String iata);
}
