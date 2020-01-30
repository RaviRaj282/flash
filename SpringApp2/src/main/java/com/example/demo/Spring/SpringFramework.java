package com.example.demo.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringFramework {

	public SpringFramework() {
		System.out.println("0 param Constructor is executed ");
		m1();
	}

	@Override
	public int hashCode() {
		System.out.println(getClass().getName());
		return super.hashCode();
	}

	// @GetMapping()
	@RequestMapping(value="/App1")
	public String m1() {

		return " Good Night 123456798";

	}

}
