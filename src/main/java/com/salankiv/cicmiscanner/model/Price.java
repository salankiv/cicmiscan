package com.salankiv.cicmiscanner.model;

public class Price {
	double total_price;
	Fare price_per_adult;
	Fare price_per_child;
	Fare price_per_infant;
	Restriction restrictions;

	public Price(double total_price, Fare price_per_adult, Fare price_per_child, Fare price_per_infant, Restriction restrictions) {
		this.total_price = total_price;
		this.price_per_adult = price_per_adult;
		this.price_per_child = price_per_child;
		this.price_per_infant = price_per_infant;
		this.restrictions = restrictions;
	}

	public Price() {
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Fare getPrice_per_adult() {
		return price_per_adult;
	}

	public void setPrice_per_adult(Fare price_per_adult) {
		this.price_per_adult = price_per_adult;
	}

	public Fare getPrice_per_child() {
		return price_per_child;
	}

	public void setPrice_per_child(Fare price_per_child) {
		this.price_per_child = price_per_child;
	}

	public Fare getPrice_per_infant() {
		return price_per_infant;
	}

	public void setPrice_per_infant(Fare price_per_infant) {
		this.price_per_infant = price_per_infant;
	}

	public Restriction getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(Restriction restrictions) {
		this.restrictions = restrictions;
	}
}
