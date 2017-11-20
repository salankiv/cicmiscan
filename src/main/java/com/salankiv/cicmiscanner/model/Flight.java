package com.salankiv.cicmiscanner.model;

public class Flight {
	String departs_at;
	String arrives_at;
	Airport origin;
	Airport destination;
	String marketing_airline;
	String operating_airline;
	String flight_number;
	String aircraft;
	BookingInformation booking_info;

	public Flight(String departs_at, String arrives_at, Airport origin, Airport destination, String marketing_airline, String operating_airline, String flight_number, String aircraft, BookingInformation booking_info) {
		this.departs_at = departs_at;
		this.arrives_at = arrives_at;
		this.origin = origin;
		this.destination = destination;
		this.marketing_airline = marketing_airline;
		this.operating_airline = operating_airline;
		this.flight_number = flight_number;
		this.aircraft = aircraft;
		this.booking_info = booking_info;
	}

	public Flight() {
	}

	public String getDeparts_at() {
		return departs_at;
	}

	public void setDeparts_at(String departs_at) {
		this.departs_at = departs_at;
	}

	public String getArrives_at() {
		return arrives_at;
	}

	public void setArrives_at(String arrives_at) {
		this.arrives_at = arrives_at;
	}

	public Airport getOrigin() {
		return origin;
	}

	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public String getMarketing_airline() {
		return marketing_airline;
	}

	public void setMarketing_airline(String marketing_airline) {
		this.marketing_airline = marketing_airline;
	}

	public String getOperating_airline() {
		return operating_airline;
	}

	public void setOperating_airline(String operating_airline) {
		this.operating_airline = operating_airline;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public BookingInformation getBooking_info() {
		return booking_info;
	}

	public void setBooking_info(BookingInformation booking_info) {
		this.booking_info = booking_info;
	}
}
