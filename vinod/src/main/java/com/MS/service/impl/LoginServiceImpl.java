package com.MS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MS.entity.UserRegistrationEntity;
import com.MS.repository.UserSignInRepository;
import com.MS.service.LoginService;
	
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserSignInRepository rep;
	
	@Override
	public UserRegistrationEntity saveNewEmployee(UserRegistrationEntity entity) {
		// TODO Auto-generated method stub
		UserRegistrationEntity entity1 = new UserRegistrationEntity();
		entity1 = rep.save(entity);
		if(entity1 !=null) {
			 return entity1;
		}
		
		return null;
	}

	@Override
	public UserRegistrationEntity findByEUsernameAndEpassword(String eUsername,String ePassword) {
		// TODO Auto-generated method stub
		UserRegistrationEntity isUserExisted = rep.findByEUsernameAndEPassword(eUsername, ePassword);
		
		return isUserExisted;
	}
	
	
}