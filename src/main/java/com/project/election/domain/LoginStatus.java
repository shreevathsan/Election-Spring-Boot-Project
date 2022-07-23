package com.project.election.domain;

public class LoginStatus {

	private String status;
	private String userName;
	private int id;

	public LoginStatus() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SucesLogin [status=" + status + ", userName=" + userName + ", id=" + id + "]";
	}
	

}
