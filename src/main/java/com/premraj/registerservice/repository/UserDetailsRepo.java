package com.premraj.registerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.premraj.registerservice.constant.Status;
import com.premraj.registerservice.entity.User;

@Repository
public interface UserDetailsRepo extends JpaRepository<User, Integer> {

	@Modifying
	@Transactional
	@Query(value = "update user set status=?1 where email=?2", nativeQuery = true)
	void updateStatus(String status, String email);

	@Query(value = "select status from user where email=?", nativeQuery = true)
	String getUserStatus(String email);

	

}
