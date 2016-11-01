package niit.colloborations.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import niit.colloborations.dao.UserDAO;
import niit.colloborations.model.Blog;
import niit.colloborations.model.Message;
import niit.colloborations.model.OutputMessage;
import niit.colloborations.model.User;
import niit.colloborations.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userservice;

	@RequestMapping("/")
	public ModelAndView showWelcome() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/home")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView showLogin(Model map) {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@ModelAttribute("user")
	public User returnObject()
	{
		return new User();
	}


/*@RequestMapping("/wall")
	public ModelAndView showRegister() {
		ModelAndView mv = new ModelAndView("wall");
		return mv;
	}*/
	@RequestMapping("/wall")
	public ModelAndView wall(Principal p) {

	    //sparx.model.User user = userService.getUserByUsername(activeUser.getUsername());
		System.out.println("Name:"+p.getName());
	    User user=userservice.getUserByName(p.getName());
	    int id=user.getUser_id();
	    User u1=userservice.getUserById(id);
	    System.out.println("u1:"+u1);
	    return new ModelAndView("wall","data",u1);
	}

	@RequestMapping("/Chat")
	public ModelAndView showChat() {
		ModelAndView mv = new ModelAndView("chatpage");
		System.out.println("in chat controller");
		return mv;
	}

	 @MessageMapping("/chat")
	  @SendTo("/topic/message")
	  public OutputMessage sendMessage(Message message) {
	    return new OutputMessage(message, new Date());
	  }

	 @RequestMapping("/SignUp")
		public ModelAndView showNewUser() {
			ModelAndView mv = new ModelAndView("SignUp");
			System.out.println("in Home controller");
			return mv;
		}
	 @RequestMapping("/register")
		public String createUser(@ModelAttribute("user") User user,@RequestParam("img") MultipartFile file,Model model,HttpServletRequest request)throws IOException
		{
		 	String filename;
		 	byte[]bytes;
		 	
		 			 user.setRole("ROLE_USER");
		 			 user.setEnabled(true);
		 			userservice.saveOrUpdate(user);
		 			System.out.println("image");
		 			MultipartFile image=user.getImg();
		 			Path path;
		 			path=Paths.get("D://NewPrj2//colloboration//src//main//webapp//resources//images//"+user.getUser_id()+".jpg");
		 			//String path = request.getSession().getServletContext().getRealPath("/resources/images/" + user.getUser_id() + ".jpg");
		            System.out.println("Path = " + path);
		            System.out.println("File name = " + user.getImg().getOriginalFilename());
		           /* File f = new File(path);
		            BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
		            bs.write(bytes);
		            bs.close();
		            System.out.println("Picture uploaded");
		        } catch (Exception ex) {
		            System.out.println(ex.getMessage());
		        }*/
		            if(image!=null && !image.isEmpty())
		            {
		            	try
		            	{
		            	   image.transferTo(new File(path.toString()));
		            	   System.out.println("Image Saved in:"+path.toString());
		            	}catch(Exception e)
		            	{
		            		e.printStackTrace();
		            		System.out.println("Image not saved");
		            	}
		            }
			return "login";
		}
	 @RequestMapping("/logincheck")
		public ModelAndView login(@RequestParam (value="error", required = false) String error,Model model,HttpServletRequest request) 
		{
			 String go=null;
			String name=request.getParameter("user_name");
			 String pass=request.getParameter("password");
			 if(userservice.login(name, pass))
			 {
				 go="home";
			 }
			 else
			 {
				 model.addAttribute("error", "Invalid username and password!");
				 go="login";
			 }
			 	HttpSession hs=request.getSession();
			 	hs.setAttribute("nn", name);
		       ModelAndView mv=new ModelAndView(go);
		       mv.addObject("name",name);
		       return mv;
		   }

	
}







