package com.premraj.registerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premraj.registerservice.model.Login;

@Repository
public interface LoginServiceRepo extends CrudRepository<Login, Integer>{

}
