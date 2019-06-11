package com.bionische.lms.hr.contoller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bionische.lms.index.IndexController;

@Controller
public class HrIndexController {

	
Logger logger = LoggerFactory.getLogger(HrIndexController.class);
	
	@RequestMapping(value = "/showAddNewJob", method = RequestMethod.GET)
	public ModelAndView showAddNewJob(HttpServletRequest request) {
		 
		logger.debug("show Add New Job ...");
		
		ModelAndView model=new ModelAndView("master/hr/addNewJob");
	
		return model;
	}
	
	@RequestMapping(value = "/showAddNewDepartment", method = RequestMethod.GET)
	public ModelAndView showAddNewDepartment(HttpServletRequest request) {
		 
		logger.debug("show Add New Job ...");
		
		ModelAndView model=new ModelAndView("master/hr/addNewDepartment");
	
		return model;
	}
}
