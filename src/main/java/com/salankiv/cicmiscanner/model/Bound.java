package com.salankiv.cicmiscanner.model;

import java.util.List;

public class Bound {
	Flight[] flights;

	public Bound(Flight[] flights) {
		this.flights = flights;
	}

	public Bound() {
	}

	public Flight[] getFlights() {
		return flights;
	}

	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}
}