package com.salankiv.cicmiscanner.model;

public class Airport {
	String airport;
	String terminal;

	public Airport(String airport, String terminal) {
		this.airport = airport;
		this.terminal = terminal;
	}

	public Airport() {
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
}
