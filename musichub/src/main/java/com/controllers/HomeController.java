package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "index";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/AboutUs")
	public String aboutUsPage() {
		return "AboutUs";
	}

	@RequestMapping("/Home")
	public String homePage() {
		return "Home";
	}

	@RequestMapping("/SignUp")
	public String signUpPage() {
		return "SignUp";
	}

	@RequestMapping("/Products")
	public String productPage() {
		return "Products";
	}

}
