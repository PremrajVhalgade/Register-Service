package com.premraj.registerservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActivateAccount {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String registeredEmail;
	private String temporaryPassword;
	private String newPassword;
	private String confirmPassword;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRegisteredEmail() {
		return registeredEmail;
	}
	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}
	public String getTemporaryPassword() {
		return temporaryPassword;
	}
	public void setTemporaryPassword(String temporaryPassword) {
		this.temporaryPassword = temporaryPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "ActivateAccount [userId=" + userId + ", registeredEmail=" + registeredEmail + ", temporaryPassword="
				+ temporaryPassword + ", newPassword=" + newPassword + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
}
