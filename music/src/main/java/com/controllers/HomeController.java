package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserService;
import com.model.userDetails;

@Controller
public class HomeController {
	
	@Autowired
	UserService us;
	@RequestMapping("/index")
	public String showPage()
	{
		System.out.println("In Show Page");
		return "index";
	}
	@RequestMapping("login")
	public ModelAndView loginPage()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("signup")
	public ModelAndView regPage()
	{
		ModelAndView mv=new ModelAndView("signup");
		return mv;
	}
	@RequestMapping("/aboutus")
	public ModelAndView aboutUsPage()
	{
		ModelAndView mv=new ModelAndView("aboutus");
		return mv;
	}
	@ModelAttribute
	
	public userDetails create()
	{
		System.out.println("inside model Attribute");
		return new userDetails();
	}
	
}












