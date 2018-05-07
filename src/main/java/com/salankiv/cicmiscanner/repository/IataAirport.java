package com.salankiv.cicmiscanner.repository;

import javax.persistence.*;

@Entity
@Table(name = "iata_airport_codes")
public class IataAirport {

    @Id
    String airport;
    String code;
    int inspiration;

    public IataAirport(String airport, String code, int inspiration) {
        this.airport = airport;
        this.code = code;
        this.inspiration = inspiration;
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

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }
}