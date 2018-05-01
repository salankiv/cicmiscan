package com.salankiv.cicmiscanner.service;

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

	private String lowFareSearchUrl;
	private String inspirationSearchUrl;

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

	public String getLowFareSearchUrl() {
		this.lowFareSearchUrl = System.getenv("low-fare-url");
		this.lowFareSearchUrl += "origin=" + this.getOrigin();
		this.lowFareSearchUrl += "&destination=" + this.getDestination();
		this.lowFareSearchUrl += "&departure_date=" + this.getDeparture_date();
		if (this.isOneway() == false) {
			this.lowFareSearchUrl += "&return_date=" + this.getReturn_date();
		}
		if (this.getAdults() != 0) {
			this.lowFareSearchUrl += "&adults=" + this.getAdults();
		} else {
			this.lowFareSearchUrl += "&adults=1";
		}
		if (this.getMax_price() != 0) {
			this.lowFareSearchUrl += "&max_price=" + this.getMax_price();
		}
		if (!this.getCurrency().equals("")) {
			this.lowFareSearchUrl += "&currency=" + this.getCurrency();
		}
		if (this.getNumber_of_results() != 0) {
			this.lowFareSearchUrl += "&number_of_results=" + this.getNumber_of_results();
		} else {
			this.lowFareSearchUrl += "&number_of_results=5";
		}
		this.lowFareSearchUrl += "&apikey=" + this.getApikey();

		return this.lowFareSearchUrl;
	}

	public String getInspirationSearchUrl() {
		this.inspirationSearchUrl = System.getenv("inspiration-url");
		this.inspirationSearchUrl += "apikey=" + this.getApikey();
		this.inspirationSearchUrl += "&origin=" + this.getOrigin();
		if (!this.getDeparture_date().equals("")) {
			this.inspirationSearchUrl += "&departure_date=" + this.getDeparture_date();
		}
		if (this.isOneway() == true) {
			this.inspirationSearchUrl += "&one-way=true";
		}
		if (this.isDirect() == true) {
			this.inspirationSearchUrl += "&direct=true";
		}
		if (!this.getDuration().equals("")) {
			this.inspirationSearchUrl += "&duration=" + this.getDuration();
		}
		if (this.getMax_price() != 0) {
			this.inspirationSearchUrl += "&max_price=" + this.getMax_price();
		}

		return this.inspirationSearchUrl;
	}
}