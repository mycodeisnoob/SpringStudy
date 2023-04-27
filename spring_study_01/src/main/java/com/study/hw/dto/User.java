package com.study.hw.dto;

public class User {

	private String userId;
	private String userPassword;
	private Grade grade;
	
	public User() {
	}

	public User(String userId, String userPassword, Grade grade) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.grade = grade;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
	
}
