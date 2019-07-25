package com.MS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MS.dto.UserRegDto;
import com.MS.entity.UserRegistrationEntity;
import com.MS.service.LoginService;

@Controller
@RequestMapping(value = "/empLogin")
public class SigninController {

	@Autowired
	public LoginService loginService;
	
	@RequestMapping(method = RequestMethod.POST)
	public String signinIntoAcc(HttpServletRequest request, HttpServletResponse response, Model model, UserRegDto userRegDto) {
		
		UserRegistrationEntity findByEnameandEpassword = loginService.findByEUsernameAndEpassword(userRegDto.getEusername(), userRegDto.getEpass());
		if(findByEnameandEpassword !=null) {
			model.addAttribute("statusMessage", "Logged in" );
			return "successpage";
		}
		else {
			model.addAttribute("statusMessage", "Username and password are wrong" );
			return "login";
		}
	}
}
