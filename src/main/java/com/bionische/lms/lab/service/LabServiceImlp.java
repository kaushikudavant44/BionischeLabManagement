package com.bionische.lms.lab.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionische.lms.demo.model.Item;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.lab.model.LabAvailableTestHeader;
import com.bionische.lms.lab.model.LabBranches;
import com.bionische.lms.lab.model.LabStaff;
import com.bionische.lms.lab.model.LabStaffLogin;
import com.bionische.lms.lab.repository.ItemRepository;
import com.bionische.lms.lab.repository.LabAvailableTestHeaderRepository;
import com.bionische.lms.lab.repository.LabBranchesRepository;
import com.bionische.lms.lab.repository.LabRepository;
import com.bionische.lms.lab.repository.LabStaffRepository;
import com.bionische.lms.test.model.Test;
import com.bionische.lms.test.model.TestFactors;
import com.bionische.lms.test.repository.TestRepository;
import com.bionische.lms.util.Info;

@Service
public class LabServiceImlp implements LabService {

	Logger logger = LoggerFactory.getLogger(LabServiceImlp.class);
	@Autowired
	private LabRepository labRepository;
	@Autowired
	LabBranchesRepository labBranchesRepository;
	@Autowired
	LabStaffRepository labStaffRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	LabAvailableTestHeaderRepository labAvailableTestHeaderRepository;
	@Autowired
	TestRepository testRepository;
	@Override
	public Lab addLab(Lab lab) {
		return labRepository.save(lab);
	}

	@Override
	public Info updateLabIsUsedStatus(int labId, int isUsed) {

		Info info=new Info();
		info.setError(true);
		int res=labRepository.updateLabIsUsedStatus(labId, isUsed);
		if(res>0)
		{
			info.setError(false); 
			info.setMessage("update Lab IsUsedS tatus");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to update Lab IsUsed Status ");
		}
		return info;
	}

	@Override
	public List<Lab> gatAllLab() {
	 
		return labRepository.findByIsUsed(1);
	}

	@Override
	public Lab getLabByLabId( int labId) {
		try {
		return	labRepository.findByLabIdAndIsUsed(labId, 1);
	 
		}
		catch (Exception e) {
			  logger.error("Lab Details not found!", e);
			return null;
		}
	}

	@Override
	public LabBranches addLabBranch(LabBranches labBranches) {
try {
	return labBranchesRepository.save(labBranches);
		
}
catch (Exception e) {
	  logger.error("Add new Lab Branch !", e);
}		
		return null; 
	}

	@Override
	public Info updateLabBranchIsUsedStatus(int branchId, int isUsed) {
		Info info=new Info();
		info.setError(true);
		int res=labBranchesRepository.updateLabBranchIsUsedStatus(branchId, isUsed);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("update Lab Branch IsUsed Status");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to update Lab Branch IsUsed Status ");
		}
		return info;
	}

	@Override
	public List<LabBranches> getBranchByLabId(int labId) {
		 
		return labBranchesRepository.findByLabIdAndIsUsed(labId, 1);
	}

	@Override
	public LabBranches getLabBranchByBranchId(int branchId) {
		return labBranchesRepository.findByBranchIdAndIsUsed(branchId, 1);
	}

	@Override
	public LabStaff addLabStaff(LabStaff labStaff) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
			messageDigest.update(labStaff.getPassword().getBytes(),0, labStaff.getPassword().length());  
			String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
			if (hashedPass.length() < 32) {
			   hashedPass = "0" + hashedPass; 
			} 
			labStaff.setPassword(hashedPass);
			LabStaff labStaffRes=labStaffRepository.save(labStaff);
		return labStaffRes;
		}catch (Exception e) {
			logger.error("Add new Lab Staff !", e);
		}
		return null;
	}

	@Override
	public Info updateLabStaffIsUsedStatus(int staffId, int isUsed) {
		Info info=new Info();
		info.setError(true);
		int res=labStaffRepository.updateLabStaffIsUsedStatus(staffId, isUsed);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("Lab staff Is used Status change to "+isUsed);
		}
		else {
			info.setError(true);
			info.setMessage("Failed to change isUsed status of Lab staff");
		}
		return info;
	}

	@Override
	public Info updateLabStaffRole(int staffId, int staffRoleId) {
		Info info=new Info();
		info.setError(true);
		int res=labStaffRepository.updateLabStaffRole(staffId, staffRoleId);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("Lab update Lab Staff Role");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to update Lab Staff Role");
		}
		return info;
	}

	@Override
	public List<LabStaff> getLabStatffByBranchId(int branchId) {
		try {
	 return labStaffRepository.findByBranchIdAndIsUsed(branchId, 1);
		}
		catch (Exception e) {
			logger.error("getLabStatffByBranchId!", e);
		}
		return null;
	}

	@Override
	public List<LabStaff> getLabStatffByLabId(int labId) {
		try {
		 return labStaffRepository.findByLabIdAndIsUsed(labId, 1);
		}
		catch (Exception e) {
			logger.error("getLabStatffByLabId !", e);
		}
		return null;
	}

	@Override
	public List<LabStaff> getLabStatffByStaffName(String staffName) {
		try {
			 return labStaffRepository.findByStaffNameContainingAndIsUsed(staffName, 1);
			}
			catch (Exception e) {
				logger.error("getLabStatffByLabId !", e);
			}
			return null;
	}

	@Override
	public LabStaff getLabStatffByStaffMobile(String staffMobile) {
		try {
			 return labStaffRepository.findByStaffMobileAndIsUsed(staffMobile, 1);
			}
			catch (Exception e) {
				logger.error("getLabStatffByStaffMobile !", e);
			}
			return null;
	}

	@Override
	public LabStaffLogin labStaffLogin(String staffMobile, String password) {
		LabStaffLogin labStaffLogin=new LabStaffLogin();
		Info info=new Info();
		try {
			
			info.setError(true);
			LabStaff labStaff=labStaffRepository.findByStaffMobileAndIsUsed(staffMobile, 1);
		if(labStaff==null)
		{
			info.setError(true);
			info.setMessage("User not register");
		}
		else {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
			messageDigest.update(labStaff.getPassword().getBytes(),0, labStaff.getPassword().length());  
			String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
			if (hashedPass.length() < 32) {
			   hashedPass = "0" + hashedPass; 
			} 
			if(labStaff.equals(hashedPass)) {
				labStaffLogin.setLabStaff(labStaff);
				info.setError(false);
				info.setMessage("Login Successfully");
				labStaffLogin.setInfo(info);
				return labStaffLogin;
			}
			else {
			info.setError(true);
			info.setMessage("Incorrect Password");
			}
		}
		labStaffLogin.setLabStaff(labStaff);
		labStaffLogin.setInfo(info);
		}
		catch (Exception e) {
			info.setError(true);
			info.setMessage("Problem to login");
			labStaffLogin.setInfo(info);
			logger.error("labStaffLogin !", e);
		}
		 return labStaffLogin;
	}


	
	@Override
	public Item addItem(@Valid Item item) {
		return	itemRepository.save(item);
	 
	}

	@Override
	public Info updateItemIsUsedStatus(int itemId, int isUsed) {
		Info info=new Info();
		info.setError(true);
		int res=itemRepository.updateItemIsUsedStatus(itemId, isUsed);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("Lab update Branch Item isUsed Status");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to update Branch Item isUsed Status");
		}
		return info;
	}

	@Override
	public List<Item> getItemByBranchId(int branchId) {
		return itemRepository.findByBranchIdAndIsUsed(branchId, 1);
	}

	@Override
	public Info addLabAvailableTest(List<LabAvailableTestHeader> labAvailableTestHeaderList) {
	
		Info info=new Info();
		info.setError(true);
		try {
	 	labAvailableTestHeaderRepository.saveAll(labAvailableTestHeaderList);
	 	info.setError(false);
	 	info.setMessage("Successfully added");
		}
		catch (Exception e) {
			info.setError(true);
			info.setMessage("Failed to add");
			logger.error("addLabAvailableTest !", e);
		}
		
		return info;
	}

	@Override
	public List<Test> getAvailableTestByBranchId(int branchId) {
		return testRepository.getAvailableTestByBranchId(branchId);
	}

	 
}
