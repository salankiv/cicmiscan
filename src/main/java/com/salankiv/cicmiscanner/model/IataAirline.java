package com.salankiv.cicmiscanner.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "iata_airlines_codes")
public class IataAirline {

    String airline;

    @Id
    String iata;
    String icao;

    public IataAirline() {
    }

    public IataAirline(String airline, String iata, String icao) {
        this.airline = airline;
        this.iata = iata;
        this.icao = icao;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }
}
