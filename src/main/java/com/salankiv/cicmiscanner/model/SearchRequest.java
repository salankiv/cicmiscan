package com.salankiv.cicmiscanner.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchRequest {
	private String apikey;
	private String origin;
	private String destination;
	private String departure_date;
	private String return_date;
	private int adults;
	private int max_price;
	private String currency;
	private int number_of_results;
	private boolean oneway;
	private String duration;
	private boolean direct;
	private boolean origin_only;

	public SearchRequest() {
		this.apikey = System.getenv("apikey.text");
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

	public boolean isOneway() {
		return oneway;
	}

	public void setOneway(boolean oneway) {
		this.oneway = oneway;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public boolean isDirect() {
		return direct;
	}

	public void setDirect(boolean direct) {
		this.direct = direct;
	}

	public boolean isOrigin_only() {
		return origin_only;
	}

	public void setOrigin_only(boolean origin_only) {
		this.origin_only = origin_only;
	}
}