package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.model.Login;
import com.premraj.registerservice.model.UserDetails;
import com.premraj.registerservice.repository.UserDetailsServiceRepo;

@Service
public class UserDetailsServiceImpl {

	@Autowired
	private UserDetailsServiceRepo userDetailsServiceRepo;

	public void saveUser(UserDetails userDetails) {
		this.userDetailsServiceRepo.save(userDetails);
	}

//	public void saveLoggedInUser(Login loggedInUser) {
//	this.registerServiceRepo.save(loggedInUser);
//		
//	}

}
