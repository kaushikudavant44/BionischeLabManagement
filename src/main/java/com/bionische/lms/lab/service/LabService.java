package com.bionische.lms.lab.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.bionische.lms.demo.model.Item;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.lab.model.LabAvailableTestHeader;
import com.bionische.lms.lab.model.LabBranches;
import com.bionische.lms.lab.model.LabStaff;
import com.bionische.lms.lab.model.LabStaffLogin;
import com.bionische.lms.test.model.Test;
import com.bionische.lms.test.model.TestFactors;
import com.bionische.lms.util.Info;

public interface LabService {

	
	public Lab addLab(Lab lab);
	
	public Info updateLabIsUsedStatus(int labId,int isUsed);

	public List<Lab> gatAllLab();

	public Lab getLabByLabId( int labId);
	
	public LabBranches addLabBranch(LabBranches labBranches);

	public Info updateLabBranchIsUsedStatus(int branchId, int isUsed);

	public List<LabBranches> getBranchByLabId(int labId);

	public LabBranches getLabBranchByBranchId(int branchId);

	public LabStaff addLabStaff( LabStaff labStaff);

	public Info updateLabStaffIsUsedStatus(int staffId, int isUsed);

	public Info updateLabStaffRole(int staffId, int staffRoleId);

	public List<LabStaff> getLabStatffByBranchId(int branchId);

	public List<LabStaff> getLabStatffByLabId(int labId);

	public List<LabStaff> getLabStatffByStaffName(String staffName);

	public LabStaff getLabStatffByStaffMobile(String staffMobile);

	public  LabStaffLogin  labStaffLogin(String staffMobile, String password);
	
	public Item addItem(@Valid Item item);

	public Info updateItemIsUsedStatus(int itemId, int isUsed);

	public List<Item> getItemByBranchId(int branchId);

	public Info addLabAvailableTest(   List<LabAvailableTestHeader> labAvailableTestHeaderList);

	public List<Test> getAvailableTestByBranchId(int branchId);

	public Info updateAvailableTestIsUsedStatusByBranchIdAndTestId(int branchId, int testId, int isUsed);
}
