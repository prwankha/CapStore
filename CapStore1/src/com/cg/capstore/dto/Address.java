package com.cg.capstore.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String primaryAddress;
	private String homeAddress;
	private String officeAddress;

	public Address() {}

	public Address(String primaryAddress, String homeAddress, String officeAddress) {
		super();
		this.primaryAddress = primaryAddress;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Address [primaryAddress=" + primaryAddress + ", homeAddress=" + homeAddress + ", officeAddress="
				+ officeAddress + "]";
	}
}