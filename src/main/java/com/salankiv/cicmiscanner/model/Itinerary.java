package com.salankiv.cicmiscanner.model;

import java.util.List;

public class Itinerary {
	List<Bound> outbound;
	List<Bound> inbound;

	public Itinerary(List<Bound> outbound, List<Bound> inbound) {
		this.outbound = outbound;
		this.inbound = inbound;
	}

	public Itinerary() {
	}

	public List<Bound> getOutbound() {
		return outbound;
	}

	public void setOutbound(List<Bound> outbound) {
		this.outbound = outbound;
	}

	public List<Bound> getInbound() {
		return inbound;
	}

	public void setInbound(List<Bound> inbound) {
		this.inbound = inbound;
	}
}
