package com.premraj.registerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premraj.registerservice.model.Login;
import com.premraj.registerservice.model.UserDetails;

@Repository
public interface UserDetailsServiceRepo extends JpaRepository<UserDetails, Integer> {
	
}
