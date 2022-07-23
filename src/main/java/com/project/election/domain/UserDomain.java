package com.project.election.domain;

import java.util.Date;

public class UserDomain {
	private int referenceId;
	private String voterId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String aadhaarNumber;
	private String gender;
	private int city;
	private String address;
	private String mobileNumber;
	private String password;

	public int getId() {
		return referenceId;
	}

	public void setId(int referenceId) {
		this.referenceId = referenceId;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDomain [id=" + referenceId + ", voterId=" + voterId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dob=" + dob + ", aadhaarNumber=" + aadhaarNumber + ", gender=" + gender + ", city="
				+ city + ", address=" + address + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ ", getId()=" + getId() + ", getVoterId()=" + getVoterId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDob()=" + getDob() + ", getAadhaarNumber()="
				+ getAadhaarNumber() + ", getGender()=" + getGender() + ", getCity()=" + getCity() + ", getAddress()="
				+ getAddress() + ", getMobileNumber()=" + getMobileNumber() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
