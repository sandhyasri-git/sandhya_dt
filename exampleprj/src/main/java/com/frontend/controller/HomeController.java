package com.frontend.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.example.model.User;



@Controller
public class HomeController {
	@RequestMapping("/")
	public String showIndex()
	{
		return "home";
	}

	@RequestMapping("/signin")
	public String showLogin()
	{
		return "signin";
	}
	@RequestMapping("/signup")
	public ModelAndView showRegister(@ModelAttribute("user")User user,BindingResult result,HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("signup");
		return mv;
	}
	@RequestMapping("/aboutus")
	public String showabout()
	{
		return "aboutus";
	}
	@RequestMapping("/viewproducts")
	public String showproducts()
	{
		return "viewproducts";
	}
	@RequestMapping("/home")
	public String showHome()
	{
		return "home";
	}
	@RequestMapping("/validate")
	public ModelAndView checkUser(@RequestParam("txtFName")String s1,@RequestParam("txtPass")String s2) throws IOException
	{
		String message;
		ModelAndView mv;
		if(s1.equals("sa")&&s2.equals("sa"))
		{
			message="valid";
			mv=new ModelAndView("adminHome");
			mv.addObject("info",message);
		}
		else
		{
			message="invalid";
			mv=new ModelAndView("signin");
			mv.addObject("info",message);
		}
		return mv;
	}
	public Object returnObject()
	{
		return new User();
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addUser(@ModelAttribute("user")User user, 
	   ModelMap model,BindingResult result,HttpServletRequest request) {
	      model.addAttribute("name", user.getUsername());
	      model.addAttribute("email",user.getEmailid());
	      model.addAttribute("id", user.getId());
	      model.addAttribute("phno", user.getPhno());
	      
	      return "signin";
	   }
}












