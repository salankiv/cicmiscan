package com.salankiv.cicmiscanner.model;

import java.util.List;

public class Bound {
	List<Flight> flights;

	public Bound(List<Flight> flights) {
		this.flights = flights;
	}

	public Bound() {
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
}
