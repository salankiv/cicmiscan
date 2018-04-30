package com.salankiv.cicmiscanner.model;

public class BookingInformation {
	String travel_class;
	String booking_code;
	int seats_remaining;

	public BookingInformation(String travel_class, String booking_code, int seats_remaining) {
		this.travel_class = travel_class;
		this.booking_code = booking_code;
		this.seats_remaining = seats_remaining;
	}

	public BookingInformation() {
	}

	public String getTravel_class() {
		return travel_class;
	}

	public void setTravel_class(String travel_class) {
		this.travel_class = travel_class;
	}

	public String getBooking_code() {
		return booking_code;
	}

	public void setBooking_code(String booking_code) {
		this.booking_code = booking_code;
	}

	public int getSeats_remaining() {
		return seats_remaining;
	}

	public void setSeats_remaining(int seats_remaining) {
		this.seats_remaining = seats_remaining;
	}
}