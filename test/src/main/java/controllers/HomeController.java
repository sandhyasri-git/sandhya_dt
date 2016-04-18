package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ProductDAOImpl;
import model.Product;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping("/AboutUs")
	public String aboutUsPage()
	{
		return "AboutUs";
	}
	@RequestMapping("/Registration")
	public String regPage()
	{
		return "Registration";
	}
	@RequestMapping("/Sample")
	public String samplePage()
	{
		return "Sample";
	}
	@RequestMapping("/Home")
	public String homePage(ModelMap model)
	{
		ProductDAOImpl pList=new ProductDAOImpl();
		ArrayList<Product> p1= new ArrayList<Product>();
		p1=pList.getProductList();
		model.addAttribute("products",p1);
		return "Home";
	}
	
}
	
