package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.model.UserDetails;
import com.premraj.registerservice.repository.RegisterServiceRepo;

@Service
public class RegisterServiceImpl   {
	
	@Autowired
	private RegisterServiceRepo registerServiceRepo;
	
	public void saveUser(UserDetails userDetails) {
		
		registerServiceRepo.save(userDetails);
	}

}
