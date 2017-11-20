package com.salankiv.cicmiscanner.model;

import java.util.List;

public class Result {
	List<Itinerary> itineraries;
	Price price;

	public Result(List<Itinerary> itineraries, Price price) {
		this.itineraries = itineraries;
		this.price = price;
	}

	public Result() {
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}
