package com.salankiv.cicmiscanner.model;

public class Root {
	String currency;
	Result results;

	public Root(String currency, Result results) {
		this.currency = currency;
		this.results = results;
	}

	public Root() {
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Result getResults() {
		return results;
	}

	public void setResults(Result results) {
		this.results = results;
	}
}
