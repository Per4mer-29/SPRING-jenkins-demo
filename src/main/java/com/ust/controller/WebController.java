package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/web")
public class WebController {
	@GetMapping("/home")
	public String getHomePage() {
		return "Welecome to home page";
	}
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Welecome to Admin page";
	}
	@GetMapping("/user")
	public String getUserPage() {
		return "Welecome to User page";
	}

}
