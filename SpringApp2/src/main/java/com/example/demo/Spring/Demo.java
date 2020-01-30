package com.example.demo.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	public Demo() {
		System.out.println("constructor executed");
	}

	@GetMapping

	public void m1() {
		System.out.println("Method calling");

	}

	public void m2() {
		System.out.println(" m1 will be executed ");

	}

	public void m3() {
		System.out.println("message printing");
	}

}
