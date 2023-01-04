package com.premraj.registerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.premraj.registerservice.entity.Login;

@Repository
public interface LoginRepo extends CrudRepository<Login, Integer>{

}
