package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showWelcome(String msg) {
		msg = "Welcome chandu velagapud";
		return "welcome";

	}

}
