package com.niit.controller;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.Service.CategoryService;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
Logger logger=Logger.getLogger(HomeController.class);
public HomeController () {
logger.debug("CREATING INSTANCE FOR HOMECONTROLLER");
}
@RequestMapping("/home")
public String home(HttpSession session) {
	logger.debug("ENTERING HOME METHOD IN HOMECONTROLLER");
	session.setAttribute("categories",categoryService.getCategories());
	return "home";
}
@RequestMapping("/aboutUs")
public String aboutUs () {
	logger.debug("ENETERING ABOUTUS METHOD IN HOMECONTROLLER");
	return "aboutUs";
}

//login?error, login?logout, login
@RequestMapping("/login")
public String login(@RequestParam(value="error",required=false) String error,
		@RequestParam(value="logout",required=false) String logout,Model model){
	if(error!=null)
		model.addAttribute("error","Invalid Username and Password.. Please enter valid username and password");
	if(logout!=null)
		model.addAttribute("logout","Loggedout successfully..");
	return "login";
}








}
