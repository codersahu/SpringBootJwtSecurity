package com.Jwt.example.JwtExample.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jwt.example.JwtExample.Entity.Users;
import com.Jwt.example.JwtExample.Service.UserService;

@RequestMapping("/home")
@RestController
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<Users> getUser() {
		System.out.println("gettting user");
		return userService.getUsers();
	}
	
	@GetMapping("/currentuser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
