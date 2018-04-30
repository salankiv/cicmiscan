package com.salankiv.cicmiscanner.model;

public class Restriction {
	boolean refundable;
	boolean change_penalties;

	public Restriction(boolean refundable, boolean change_penalties) {
		this.refundable = refundable;
		this.change_penalties = change_penalties;
	}

	public Restriction() {
	}

	public boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}

	public boolean isChange_penalties() {
		return change_penalties;
	}

	public void setChange_penalties(boolean change_penalties) {
		this.change_penalties = change_penalties;
	}
}