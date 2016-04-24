package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ProdService;
import com.model.userDetails;


@Controller
public class HomeController {
	
	@Autowired
	ProdService ps;
	
	@RequestMapping("/")
	public String showPage() {
		return "index";
	}

	@RequestMapping("/login")
	public ModelAndView loginPage()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
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
	public ModelAndView signUpPage() {
		System.out.println("signup");
		ModelAndView mv=new ModelAndView("SignUp");
		return mv;
		
	}
	
	@RequestMapping("/Products")
	public String productPage() {
		return "Products";
	}
		
	@RequestMapping("/home")
	public String gotoHome()
	{
		return "home";
	}
	@ModelAttribute("user")
	 public userDetails construct()
	 {
	  return new userDetails();
	 }
	 @RequestMapping(value="/u_register",method=RequestMethod.POST)
	 public String doRegister(@ModelAttribute("user") userDetails user)
	 {
	  System.out.println(user.getUserId());
	     ps.insertUser(user);
	  return "signUp";
	 }
	

}



