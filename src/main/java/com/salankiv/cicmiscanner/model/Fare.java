package com.salankiv.cicmiscanner.model;

public class Fare {
	double total_fare;
	double tax;

	public Fare(double total_fare, double tax) {
		this.total_fare = total_fare;
		this.tax = tax;
	}

	public Fare() {
	}

	public double getTotal_fare() {
		return total_fare;
	}

	public void setTotal_fare(double total_fare) {
		this.total_fare = total_fare;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
