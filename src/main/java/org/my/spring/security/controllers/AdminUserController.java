package org.my.spring.security.controllers;

import org.my.spring.security.models.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
	// The admin user should be able to get all the users by this controller
	
	@RequestMapping(value="/getUsers",method=RequestMethod.GET)
	public Object getUsersData() {
		Users users = new Users();
	
		users.setAge(23);
		users.setName("oddio");
		return users;
	}
}
