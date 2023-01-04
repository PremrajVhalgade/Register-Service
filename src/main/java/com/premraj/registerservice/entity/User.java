package com.premraj.registerservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int userId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	
//@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String dob;
	private String policyNo;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String status;
	private String userType;
	
	@OneToOne(mappedBy = "user")
	private ActivateAccountDetails activateAccountDetails;
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ActivateAccountDetails getActivateAccountDetails() {
		return activateAccountDetails;
	}

	public void setActivateAccountDetails(ActivateAccountDetails activateAccountDetails) {
		this.activateAccountDetails = activateAccountDetails;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", dob=" + dob + ", policyNo=" + policyNo + ", gender=" + gender
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", status=" + status + ", userType="
				+ userType + ", activateAccountDetails=" + activateAccountDetails + "]";
	}

}
