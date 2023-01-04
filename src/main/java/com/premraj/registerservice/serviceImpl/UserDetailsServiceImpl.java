package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.entity.User;
import com.premraj.registerservice.repository.UserDetailsRepo;

@Service
public class UserDetailsServiceImpl {

	@Autowired
	private UserDetailsRepo userDetailsRepo;

	public void saveUser(User userDetails) {
		this.userDetailsRepo.save(userDetails);
		System.out.println("saved user service");
	}
}
