package org.my.spring.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

	@RequestMapping(value= {"/","/home"},method=RequestMethod.GET)
	public String getHomePage() {
		
		return "home";
	}
}
