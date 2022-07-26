package com.project.election.domain;

import java.util.Date;

public class ElectionCreationDomain {

	private int electionType;
	private int city;
	private Date date;
	private String startTime;
	private String endTime;

	public ElectionCreationDomain() {
	}

	public int getElectionType() {
		return electionType;
	}

	public void setElectionType(int electionType) {
		this.electionType = electionType;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
