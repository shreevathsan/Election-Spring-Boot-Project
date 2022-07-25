package com.project.election.domain;

import java.util.Date;

public class CandidateDomain {

	private String name;
	private int city;
	private Date dob;
	private int age;
	private String mobileNumber;
	private String partyName;
	private String address;
	private int electionType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public int getElectionType() {
		return electionType;
	}

	public void setElectionType(int electionType) {
		this.electionType = electionType;
	}

	@Override
	public String toString() {
		return "CandidateDomain [name=" + name + ", city=" + city + ", dob=" + dob + ", age=" + age + ", mobileNumber="
				+ mobileNumber + ", partyName=" + partyName + ", address=" + address + ", electioType=" + electionType
				+ "]";
	}

}
