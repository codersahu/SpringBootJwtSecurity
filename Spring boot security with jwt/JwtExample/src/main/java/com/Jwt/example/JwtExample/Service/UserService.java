package com.Jwt.example.JwtExample.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.Jwt.example.JwtExample.Entity.Users;

@Service
public class UserService {
 
	private List<Users> store=new ArrayList<>();

	public UserService() {
		store.add(new Users(UUID.randomUUID().toString(),"Mohit","shieldmohitkumar@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"Amit","Amit.kumar@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"Rahul","Rahulshinde@gmail.com"));
	}
	
	public List<Users> getUsers(){
		return store;
	}
}
