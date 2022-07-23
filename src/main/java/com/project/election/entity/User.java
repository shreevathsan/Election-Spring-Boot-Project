package com.project.election.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reference_id")
	private int referenceId;

	@Column(name = "voter_id")
	private String voterId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "aadhaar_number")
	private String aadhaarNumber;

	@Column(name = "gender")
	private String gender;

	@ManyToOne
	@JoinColumn(name = "city")
	private MasterCity masterCity;

	@Column(name = "address")
	private String address;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "password")
	private String password;

	public User() {

	}

	public int getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(int referenceId) {
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

	public MasterCity getMasterCity() {
		return masterCity;
	}

	public void setMasterCity(MasterCity masterCity) {
		this.masterCity = masterCity;
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
		return "User [id=" + referenceId + ", voterId=" + voterId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dob=" + dob + ", aadhaarNumber=" + aadhaarNumber + ", gender=" + gender + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}

}
