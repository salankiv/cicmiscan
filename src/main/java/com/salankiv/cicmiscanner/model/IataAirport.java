package com.salankiv.cicmiscanner.model;

import javax.persistence.*;

@Entity
@Table(name = "iata_airport_codes")
public class IataAirport {

    @Id
    String airport;
    String code;

    public IataAirport(String airport, String code) {
        this.airport = airport;
        this.code = code;
    }

    public IataAirport() {
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