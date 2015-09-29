package com.app.domain;

public class Patient {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String city;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Patient [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", city="
				+ city + "]";
	}
	public Patient(Integer userId, String firstName, String lastName,
			String gender, String city) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = city;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
