package com.bionische.lms.lab.controller;

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

import com.bionische.lms.demo.model.Item;
import com.bionische.lms.exception.ResourceNotFoundException;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.lab.model.LabAvailableTestHeader;
import com.bionische.lms.lab.model.LabBranches;
import com.bionische.lms.lab.model.LabStaff;
import com.bionische.lms.lab.model.LabStaffLogin;
import com.bionische.lms.lab.repository.LabRepository;
import com.bionische.lms.lab.service.LabService;
import com.bionische.lms.test.model.Test;
import com.bionische.lms.util.ApiVersion;
import com.bionische.lms.util.Info;
  
@RestController
@RequestMapping("/api/lab")
@ApiVersion(1)
public class LabApiController {

	Logger logger = LoggerFactory.getLogger(LabApiController.class);
	@Autowired
	private LabRepository labRepository;
	@Autowired
	private LabService labService;

	@PostMapping("/addLab")
	public Lab addLab(@Valid @RequestBody Lab lab) {
		return labService.addLab(lab);
	}

	@PostMapping("/updateLabIsUsedStatus")
	public Info updateLabIsUsedStatus( @RequestParam("labId")int labId,@RequestParam("isUsed")int isUsed) {
		return labService.updateLabIsUsedStatus(labId,isUsed);
	}
	
	@GetMapping("/gatAllLab")
	public List<Lab> gatAllLab() {
		return labService.gatAllLab();
	}
	
	@PostMapping("/getLabByLabId")
	public ResponseEntity<Lab> getLabByLabId(@RequestParam ("labId")int labId) {
		Lab lab=labRepository.findByLabId(labId);
		if (lab == null) {
			throw new ResourceNotFoundException("Lab", "id", labId);
		} else {

			return new ResponseEntity<Lab>(lab, HttpStatus.OK);
		}
		
	 
	}
	
	@PostMapping("/addLabBranch")
	public LabBranches addLab(@Valid @RequestBody LabBranches labBranches) {
		return labService.addLabBranch(labBranches);
	}
	@PostMapping("/updateLabBranchIsUsedStatus")
	public Info updateLabBranchIsUsedStatus( @RequestParam("branchId")int branchId,@RequestParam("isUsed")int isUsed) {
		return labService.updateLabBranchIsUsedStatus(branchId,isUsed);
	}
	
	@PostMapping("/getLabBranchByLabId")
	public ResponseEntity<List<LabBranches>> getLabBranchByLabId(@RequestParam ("labId")int labId) {
		List<LabBranches> labBranchesList=labService.getBranchByLabId(labId);
		if (labBranchesList.isEmpty()) {
			throw new ResourceNotFoundException("Lab", "id", labId);
		} else {

			return new ResponseEntity<List<LabBranches>>(labBranchesList, HttpStatus.OK);
		}
	}
	@PostMapping("/getLabBranchByBranchId")
	public ResponseEntity<LabBranches> getLabBranchByBranchId(@RequestParam ("branchId")int branchId) {
		LabBranches labBranches=labService.getLabBranchByBranchId(branchId);
		if (labBranches==null) {
			throw new ResourceNotFoundException("Branch", "id", branchId);
		} else {

			return new ResponseEntity<LabBranches>(labBranches, HttpStatus.OK);
		}
	}
	
	@PostMapping("/addLabStaff")
	public LabStaff addLabStaff(@Valid @RequestBody LabStaff labStaff) {
		
	return labService.addLabStaff(labStaff);
	 
	}
	@PostMapping("/updateLabStaffIsUsedStatus")
	public Info updateLabStaffIsUsedStatus( @RequestParam("staffId")int staffId,@RequestParam("isUsed")int isUsed) {
		return labService.updateLabStaffIsUsedStatus(staffId,isUsed);
	}
	@PostMapping("/updateLabStaffRole")
	public Info updateLabStaffRole( @RequestParam("staffId")int staffId,@RequestParam("staffRoleId")int staffRoleId) {
		return labService.updateLabStaffRole(staffId,staffRoleId);
	}
	
	@PostMapping("/getLabStatffByBranchId")
	public ResponseEntity<List<LabStaff>> getLabStatffByBranchId(@RequestParam ("branchId")int branchId) {
		List<LabStaff> labStaffList=labService.getLabStatffByBranchId(branchId);
		if (labStaffList.isEmpty()) {
			throw new ResourceNotFoundException("Branch", "id", branchId);
		} else {

			return new ResponseEntity<List<LabStaff>>(labStaffList, HttpStatus.OK);
		} 
	}
	@PostMapping("/getLabStatffByLabId")
	public ResponseEntity<List<LabStaff>> getLabStatffByLabId(@RequestParam ("labId")int labId) {
		List<LabStaff> labStaffList=labService.getLabStatffByLabId(labId);
		if (labStaffList.isEmpty()) {
			throw new ResourceNotFoundException("Branch", "id", labId);
		} else {

			return new ResponseEntity<List<LabStaff>>(labStaffList, HttpStatus.OK);
		}
	}
	@PostMapping("/getLabStatffByStaffName")
	public ResponseEntity<List<LabStaff>> getLabStatffByStaffName(@RequestParam ("staffName")String staffName) {
		List<LabStaff> labStaffList=labService.getLabStatffByStaffName(staffName);
		if (labStaffList.isEmpty()) {
			throw new ResourceNotFoundException("Branch", "Name", staffName);
		} else {

			return new ResponseEntity<List<LabStaff>>(labStaffList, HttpStatus.OK);
		}
	}
	@PostMapping("/getLabStatffByStaffMobile")
	public ResponseEntity<LabStaff> getLabStatffByStaffMobile(@RequestParam ("staffMobile")String staffMobile) {
		 LabStaff  labStaff=labService.getLabStatffByStaffMobile(staffMobile);
		if (labStaff==null) {
			throw new ResourceNotFoundException("Staff", "Mobile", staffMobile);
		} else {

			return new ResponseEntity<LabStaff>(labStaff, HttpStatus.OK);
		}
	}
	@PostMapping("/labStaffLogin")
	public  LabStaffLogin  labStaffLogin(@RequestParam ("staffMobile")String staffMobile, @RequestParam ("password")String password) {
		return labService.labStaffLogin(staffMobile,password);
		 
	}
	
	
	@PostMapping("/addItem")
	public Item addItem(@Valid @RequestBody Item item) {
		return labService.addItem(item);
	}
	
	@PostMapping("/updateItemIsUsedStatus")
	public Info updateItemIsUsedStatus( @RequestParam("itemId")int itemId,@RequestParam("isUsed")int isUsed) {
		return labService.updateItemIsUsedStatus(itemId,isUsed);
	}
	
	@PostMapping("/getItemByBranchId")
	public ResponseEntity<List<Item>> getItemByBranchId(@RequestParam ("branchId")int branchId) {
		List<Item> itemList=labService.getItemByBranchId(branchId);
		if (itemList.isEmpty()) {
			throw new ResourceNotFoundException("Branch", "id", branchId);
		} else {

			return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
		}
	}
	
	@PostMapping("/addLabAvailableTest")
	public Info addLabAvailableTest(@Valid @RequestBody  List<LabAvailableTestHeader> labAvailableTestHeaderList) {
		return labService.addLabAvailableTest(labAvailableTestHeaderList);
	}
	 
	@PostMapping("/getAvailableTestByBranchId")
	public ResponseEntity<List<Test>> getAvailableTestByBranchId(@RequestParam ("branchId")int branchId) {
		List<Test> testList=labService.getAvailableTestByBranchId(branchId);
		if (testList.isEmpty()) {
			throw new ResourceNotFoundException("Branch", "id", branchId);
		} else {

			return new ResponseEntity<List<Test>>(testList, HttpStatus.OK);
		}
	}
	 
 
	
	@PostMapping("/updateAvailableTestIsUsedStatusByBranchIdAndTestId")
	public Info updateAvailableTestIsUsedStatusByBranchIdAndTestId( @RequestParam("branchId")int branchId,@RequestParam("testId")int testId,@RequestParam("isUsed")int isUsed) {
		return labService.updateAvailableTestIsUsedStatusByBranchIdAndTestId(branchId,testId,isUsed);
	}
	
	
}
