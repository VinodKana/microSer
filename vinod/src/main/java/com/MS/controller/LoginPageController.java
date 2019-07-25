package com.MS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginPageController {

	@RequestMapping(method = RequestMethod.GET)
	public String accessToken(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("statusMessage", "Please enter user details to login" );
		return "login";
	}
}
