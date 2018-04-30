package com.salankiv.cicmiscanner.model;

import javax.persistence.*;

@Entity
@Table(name = "iata_airport_codes")
public class Iata {

    @Id
    String airport;
    String code;

    public Iata(String airport, String code) {
        this.airport = airport;
        this.code = code;
    }

    public Iata() {
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}