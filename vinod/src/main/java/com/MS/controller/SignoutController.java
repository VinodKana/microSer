package com.MS.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/signout")
public class SignoutController {

	@RequestMapping(method = RequestMethod.GET)
	public String signoutFromtoAcc(HttpServletRequest request, HttpServletResponse response, Model model) {
			HttpSession session = request.getSession(true);
			
			
			
				
				return "login";
	}
			
}
