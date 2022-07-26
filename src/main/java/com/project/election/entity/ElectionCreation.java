package com.project.election.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "create_election")
public class ElectionCreation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "election_type")
	private ElectionType electionType;

	@ManyToOne
	@JoinColumn(name = "city")
	private MasterCity city;

	@Column(name = "date")
	private Date date;

	@Column(name = "start_time")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	@ManyToMany(cascade = CascadeType.REMOVE)
	@JoinTable(name = "candidate_election", joinColumns = @JoinColumn(name = "election_id"), inverseJoinColumns = @JoinColumn(name = "candidate_id"))
	private List<Candidate> candidateList;

	public ElectionCreation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ElectionType getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionType electionType) {
		this.electionType = electionType;
	}

	public MasterCity getCity() {
		return city;
	}

	public void setCity(MasterCity city) {
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

	@Override
	public String toString() {
		return "ElectionCreation [id=" + id + ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime
				+ "]";
	}

}
