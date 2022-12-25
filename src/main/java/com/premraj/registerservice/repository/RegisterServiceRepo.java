package com.premraj.registerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premraj.registerservice.model.UserDetails;

@Repository
public interface RegisterServiceRepo extends JpaRepository<UserDetails, Integer> {
	void registerUser(UserDetails userDetails);
}
