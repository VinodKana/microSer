package com.MS.service;

import org.springframework.stereotype.Service;

import com.MS.entity.UserRegistrationEntity;
	
@Service
public interface LoginService {

	public UserRegistrationEntity saveNewEmployee(UserRegistrationEntity entity);
	public UserRegistrationEntity findByEUsernameAndEpassword(String eUsername,String ePassword);
	
}