package com.MS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MS.dto.UserRegDto;
import com.MS.entity.UserRegistrationEntity;
import com.MS.service.LoginService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;

@Controller
@RequestMapping(value = "/empReg")
public class EmpRegistrarationController {

	@Autowired
	private LoginService loginService;
	@RequestMapping(method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "fallbackMethod")
	public String empRegi(HttpServletRequest request, HttpServletResponse response, Model model/*String ename,
			String eusrname, String epass*/ , UserRegDto userRegDto) {
		
		//userRegDto.getEname();
		//userRegDto.getEusername();
		//userRegDto.getEpass();
		UserRegistrationEntity entity = new UserRegistrationEntity();
		entity.setename(userRegDto.getEname());
		entity.seteUsername(userRegDto.getEusername());
		entity.setePassword(userRegDto.getEpass());
		UserRegistrationEntity saveNewEmployee = loginService.saveNewEmployee(entity);
		if(saveNewEmployee != null) {
			
			System.out.println("Employee Registered Successfully ");
			model.addAttribute("statusMessage","Employee Registered Successfully");
			return "login";
		}
		else {
			System.out.println("Employee Not registered ");
			model.addAttribute("statusMessage","Employee Not Registered");
			return "index";
		}
	}
		public String  fallbackMethod(String statusMessage){
	         
	        return "Fallback response:: Enter valid details ";
	    }

	
		public class UserApplication {

			  @LoadBalanced
			  @Bean
			  LoginService loginService(){
			    return null;
			  }
		}
}