package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.entity.User;
import com.premraj.registerservice.repository.ActivateAccountDetailsRepo;
import com.premraj.registerservice.repository.LoginRepo;
import com.premraj.registerservice.repository.UserDetailsRepo;

@Service
public class LoginServiceImpl {

	@Autowired
	private LoginRepo loginServiceRepo;

	@Autowired
	private UserDetailsRepo userDetailsRepo;
	@Autowired
	private ActivateAccountDetailsRepo activateAccountDetailsRepo;

	public String getUserByEmailAndPassword(String email, String password) {
		String userStatus = this.userDetailsRepo.getUserStatus(email);
		if (userStatus.equals("active")) {// first check
			String fetchedEmail = this.activateAccountDetailsRepo.findByEmail(email);
			String fetchedTempPasswordFromDb = this.activateAccountDetailsRepo.fetchPasswordFromDb(email);
			if (fetchedEmail.equals(email)) {// second check
				if (fetchedTempPasswordFromDb.equals(password)) {// second check
					System.out.println("Login Successful");
					return "Login Successful";
				}
			} else {
				System.out.println("Invalid Credentials");
				return "Login Failed due to invalid credentials";
			}

		} else {
			System.out.println("Account not activated. Please activate your account to login");
			return "Account not activated. Please activate your account to login";
		}
		return "";
	}
}
