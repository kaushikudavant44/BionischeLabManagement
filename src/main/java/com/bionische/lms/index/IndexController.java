package com.bionische.lms.index;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;






@Controller
public class IndexController {

	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loginPage(HttpServletRequest request) {
		 
		logger.debug("Login Mapping...");
		
		ModelAndView model=new ModelAndView("login/login");
	
		return model;
	}
	
	
	@RequestMapping(value = "/loginProess", method = RequestMethod.POST)
	public String loginProcess(HttpServletRequest request) {

		logger.info("Login Process");

		String username= request.getParameter("userName");
	    String password= request.getParameter("password");


		HttpSession session =request.getSession();
		
		session.setAttribute("userId", 1);
		session.setAttribute("userName", username);
		
		return "redirect:/home";
	}
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request) {
		 
		logger.debug("Home Mapping...");
		
		ModelAndView model=new ModelAndView("dashboard/home");
		
		return model;
		
	}
	
	
	
}
