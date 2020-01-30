package com.nit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	public User() {
		System.out.println("****0-Param Constructor is Created****");
	}
	@GetMapping("/user")
	public String userData() {

		return "Good Morning Ravi Raj ";
	}
}
