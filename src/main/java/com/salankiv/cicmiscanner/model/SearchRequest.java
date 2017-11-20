package com.salankiv.cicmiscanner.model;

public class SearchRequest {
	String apikey;
	String origin;
	String destination;
	String departure_date;
	String return_date;
	int adults;
	int max_price;
	String currency;
	int number_of_results;

	public SearchRequest() {
		this.apikey = System.getenv("API_KEY");
	}

	public SearchRequest(String apikey, String origin, String destination, String departure_date, String return_date, int adults, int max_price, String currency, int number_of_results) {
		this.apikey = System.getenv("API_KEY");
		this.origin = origin;
		this.destination = destination;
		this.departure_date = departure_date;
		this.return_date = return_date;
		this.adults = adults;
		this.max_price = max_price;
		this.currency = currency;
		this.number_of_results = number_of_results;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
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

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getMax_price() {
		return max_price;
	}

	public void setMax_price(int max_price) {
		this.max_price = max_price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getNumber_of_results() {
		return number_of_results;
	}

	public void setNumber_of_results(int number_of_results) {
		this.number_of_results = number_of_results;
	}
}
