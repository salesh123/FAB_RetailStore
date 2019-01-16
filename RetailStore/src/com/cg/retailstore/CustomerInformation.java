package com.cg.retailstore;

public class CustomerInformation {
	private String constumerType;
	private String firstVisit;

	public String getFirstVisit() {
		return firstVisit;
	}

	public void setFirstVisit(String firstVisit) {
		this.firstVisit = firstVisit;
	}

	public CustomerInformation(String constumerType, String firstVisit) {
		super();
		this.constumerType = constumerType;
		this.firstVisit = firstVisit;
	}

	public String getType() {
		return constumerType;
	}

	public void setType(String type) {
		this.constumerType = type;
	}
}
