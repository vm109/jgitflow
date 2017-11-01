package org.my.spring.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserControllers {
 
	@RequestMapping(value="/basic", method=RequestMethod.GET)
	public String userGetController() {
		
		return "user";
	}
}
