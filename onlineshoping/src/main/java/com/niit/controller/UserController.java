package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDAO;

	@Autowired
	User user;
	
	@RequestMapping(value="/login")
	public String s1()
	{
		return "User";
	}
	@ModelAttribute("user")
	public User userPro()
	{
		return new User();
	}
	@RequestMapping(value="/userPro", method=RequestMethod.POST)
	public String save(@ModelAttribute("user") User user,Model m)
	{
		
		System.out.println(user.getUsermailid());
		System.out.println(user.getUserpassword());
		userDAO.addUser(user);
		return "redirect:/User";
	}
	
	@RequestMapping(value = "/loginUser")
    public String login(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout",
            required = false) String logout, Model model) {
        if (error!=null) {
        	System.out.println("Error.....");
            model.addAttribute("error", "...Invalid username and password");
        }
        	
        if(logout!=null) {
        	System.out.println("Logout called.....");
            model.addAttribute("msg", "...You have been logged out");
        }

        return "LoginPage";
 }
}
