package com.saish.movie_ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saish.movie_ticket.dto.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/signup")
	public String loadSignup() {
		return "customer-signup.html";
	}

	@PostMapping("/signup")
	public String signup(@Valid Customer customer,BindingResult result) {
		if(result.hasErrors()) {
			return "customer-signup.html";
		}
		else {
		System.out.println("*****************************");
		System.out.println(customer);
		System.out.println("*****************************");
		return "home.html";
		}
	}
}
