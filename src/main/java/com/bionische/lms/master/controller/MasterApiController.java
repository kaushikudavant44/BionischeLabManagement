package com.bionische.lms.master.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.lms.exception.ResourceNotFoundException;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.master.service.MasterService;
import com.bionische.lms.test.model.Test;
import com.bionische.lms.test.model.TestDetails;
import com.bionische.lms.test.model.TestFactors;
import com.bionische.lms.util.ApiVersion;
import com.bionische.lms.util.Info;

@RestController
@RequestMapping("/api/master")
@ApiVersion(1)
public class MasterApiController {

	
	
	Logger logger = LoggerFactory.getLogger(MasterApiController.class);
	@Autowired
	private MasterService masterService;
	
	@PostMapping("/addTest")
	public Test addTest(@Valid @RequestBody  Test test) {
		return masterService.addTest(test);
	}
	 
	@GetMapping("/gatAllTest")
	public List<Test> gatAllTest() {
		return masterService.gatAllTest();
	}
	@PostMapping("/gatAllTestDetailsByTestId")
	public ResponseEntity<List<TestDetails>> gatAllTestDetailsByTestId(@RequestParam("testId")int testId) {
		List<TestDetails> testDetailsList= masterService.gatAllTestDetailsByTestId(testId);
		
		if (testDetailsList.isEmpty()) {
			throw new ResourceNotFoundException("Test", "id", testId);
		} else {

			return new ResponseEntity<List<TestDetails>>(testDetailsList, HttpStatus.OK);
		}
		
	}
	 
	@PostMapping("/updateTestIsUsedStatus")
	public Info updateTestIsUsedStatus( @RequestParam("testId")int testId,@RequestParam("isUsed")int isUsed) {
		return masterService.updateTestIsUsedStatus(testId,isUsed);
	}
	@PostMapping("/updateTestDetailsIsUsedStatus")
	public Info updateTestDetailsIsUsedStatus( @RequestParam("testDetailsId")int testDetailsId,@RequestParam("isUsed")int isUsed) {
		return masterService.updateTestDetailsIsUsedStatus(testDetailsId,isUsed);
	}
	
	
	
	@PostMapping("/addTestFactors")
	public TestFactors addTestFactors(@Valid @RequestBody  TestFactors testFactors) {
		return masterService.addTestFactors(testFactors);
	}

	@PostMapping("/updateTestFactorsIsUsedStatus")
	public Info updateTestFactorsIsUsedStatus( @RequestParam("factorId")int factorId,@RequestParam("isUsed")int isUsed) {
		return masterService.updateTestFactorsIsUsedStatus(factorId,isUsed);
	}
	
	@GetMapping("/gatAllTestFactors")
	public List<TestFactors> gatAllTestFactors() {
		return masterService.gatAllTestFactors();
	}
	
 
	
}
