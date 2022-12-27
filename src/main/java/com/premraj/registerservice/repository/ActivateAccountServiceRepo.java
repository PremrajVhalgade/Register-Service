package com.premraj.registerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premraj.registerservice.model.ActivateAccount;
@Repository
public interface ActivateAccountServiceRepo extends CrudRepository<ActivateAccount, Integer> {

}
