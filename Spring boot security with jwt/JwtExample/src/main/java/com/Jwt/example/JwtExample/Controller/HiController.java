package com.Jwt.example.JwtExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/intro")
@RestController
public class HiController {
	
	@GetMapping("/hi")
	public String sayHi()
	{
		return "Hi everyone";
	}
	
	@GetMapping("/bye")
	public String ByeController()
	{
		return "Bye everyone";
	}

}
