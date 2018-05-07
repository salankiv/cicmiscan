package com.salankiv.cicmiscanner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IataAirportRepo extends CrudRepository<IataAirport, String> {

    List<IataAirport> findAll();

    IataAirport findByCode(String code);

//use this if inspiration search (field value = 1)
    List<IataAirport> findByInspiration(int inspiration);
}