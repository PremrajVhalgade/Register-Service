package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.model.Login;
import com.premraj.registerservice.repository.LoginServiceRepo;

@Service
public class LoginServiceImpl {

	@Autowired
	private LoginServiceRepo loginServiceRepo;

	public void saveLoggedInUser(Login loggedInUser) {
		this.loginServiceRepo.save(loggedInUser);
	}
}
