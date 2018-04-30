package com.salankiv.cicmiscanner.model;

import java.util.List;

public class Itinerary {
	Bound outbound;
	Bound inbound;

	public Itinerary(Bound outbound, Bound inbound) {
		this.outbound = outbound;
		this.inbound = inbound;
	}

	public Itinerary() {
	}

	public Bound getOutbound() {
		return outbound;
	}

	public void setOutbound(Bound outbound) {
		this.outbound = outbound;
	}

	public Bound getInbound() {
		return inbound;
	}

	public void setInbound(Bound inbound) {
		this.inbound = inbound;
	}
}