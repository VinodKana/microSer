package com.MS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MS.entity.UserRegistrationEntity;

@Repository
public interface UserSignInRepository extends CrudRepository<UserRegistrationEntity, Long> {
	
	public UserRegistrationEntity findByEUsernameAndEPassword(String eUsername,String ePassword);
	
}
