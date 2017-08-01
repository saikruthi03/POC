package com.rbar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.rbar.model.User;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = {"http://localhost:4200"}) 
public class RestController {

	User user = null;

	@RequestMapping("/api/login")
	public String login(@RequestBody User user, UriComponentsBuilder builder) {
		System.out.println("User name is "+user.getUserName());
		this.user = user;
		return "success";
	}
	@RequestMapping("/api/initBillingLine")
	public String initBillingLine() {
		System.out.println("In init billing line");
		return "success";
	}
}