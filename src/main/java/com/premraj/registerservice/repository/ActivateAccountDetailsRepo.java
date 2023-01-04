package com.premraj.registerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.premraj.registerservice.entity.ActivateAccountDetails;
import com.premraj.registerservice.entity.User;

@Repository
public interface ActivateAccountDetailsRepo extends CrudRepository<ActivateAccountDetails, Integer> {

	@Query(value="select password from activate_account_details where registered_email=?1",nativeQuery = true)
	String fetchPasswordFromDb(String email);


	@Query(value="select registered_email from activate_account_details where registered_email=?1",nativeQuery = true)
	String findByEmail(String email);
	
	@Modifying
	@Transactional
	@Query(value="update activate_account_details set password=?1 where registered_email=?2",nativeQuery = true)
	void updateTempPassToConfirmPass(String password,String registeredEmail);
	
//	@Query(value = "select registered_email,password from activate_account_details where registered_email=?1 and  password=?2",nativeQuery = true)
//	User findByEmailAndPassword(String email, String password);
}
