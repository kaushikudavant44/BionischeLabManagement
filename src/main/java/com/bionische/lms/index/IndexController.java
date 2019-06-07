package com.bionische.lms.index;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import com.bionische.lms.hr.model.EmployeeDetails;
import com.bionische.lms.lab.model.LabStaffLogin;




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
	    
	    RestTemplate restTemplate =new RestTemplate();
	    
	    MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("staffMobile", username);
		map.add("password", password);
		
		LabStaffLogin labStaffLogin= restTemplate.postForObject("localhost:8080/api/lab/labStaffLogin", map, LabStaffLogin.class);
		
		logger.info("Login Response "+labStaffLogin.toString());


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
	
	
	@RequestMapping(value = "/advForm", method = RequestMethod.GET)
	public ModelAndView advForm(HttpServletRequest request) {
		 
		logger.debug("Login Mapping...");
		
		ModelAndView model=new ModelAndView("common/adv_form");
	
		return model;
	}
	
	
	@RequestMapping(value = "/jqTable", method = RequestMethod.GET)
	public ModelAndView jqTable(HttpServletRequest request) {
		 
		logger.debug("jqTable Mapping...");
		
		ModelAndView model=new ModelAndView("common/jqtable");
	
		return model;
	}
	
	
	
	@RequestMapping(value = "/addNewStaffMember", method = RequestMethod.GET)
	public ModelAndView addNewStaffMember(HttpServletRequest request) {
		 
		logger.debug("addNewStaffMember Mapping...");
		
		ModelAndView model=new ModelAndView("master/addNewStaff");
	
		return model;
	}
	
	@RequestMapping(value = "/addNewVendor", method = RequestMethod.GET)
	public ModelAndView addNewVendor(HttpServletRequest request) {
		 
		logger.debug("addNewVendor Mapping...");
		
		ModelAndView model=new ModelAndView("master/NewFile");
	                                                                                  
		return model;
	}
	
	@RequestMapping(value = "/applyForLeave", method = RequestMethod.GET)
	public ModelAndView applyForLeave(HttpServletRequest request) {
		
		
		
		
		
		
		 

		logger.debug("applyForLeave Mapping...");
		
		ModelAndView model=new ModelAndView("master/applyLeave");
		
		EmployeeDetails details= new EmployeeDetails();
		
		model.addObject(details);
		
		
	
		return model;
	}
	
	
	
}
