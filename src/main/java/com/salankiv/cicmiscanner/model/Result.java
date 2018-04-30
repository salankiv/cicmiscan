package com.salankiv.cicmiscanner.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
	Itinerary[] itineraries;
	Price fare;
	String destination;
	String departure_date;
	String return_date;
	String price;
	String airline;

	public Result(Itinerary[] itineraries, Price fare, String destination, String departure_date, String return_date, String price, String airline) {
		this.itineraries = itineraries;
		this.fare = fare;
		this.destination = destination;
		this.departure_date = departure_date;
		this.return_date = return_date;
		this.price = price;
		this.airline = airline;
	}

	public Result() {
	}

	public Itinerary[] getItineraries() {
		return itineraries;
	}

	public void setItineraries(Itinerary[] itineraries) {
		this.itineraries = itineraries;
	}

	public Price getFare() {
		return fare;
	}

	public void setFare(Price fare) {
		this.fare = fare;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

}