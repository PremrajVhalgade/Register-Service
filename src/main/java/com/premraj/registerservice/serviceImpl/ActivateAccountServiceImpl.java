package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.model.ActivateAccount;
import com.premraj.registerservice.repository.ActivateAccountServiceRepo;

@Service
public class ActivateAccountServiceImpl {
	
	@Autowired
	private ActivateAccountServiceRepo activateAccountServiceRepo;
	
	public void activateAccount(ActivateAccount activateAccount) {
		this.activateAccountServiceRepo.save(activateAccount);
		
	}

}
