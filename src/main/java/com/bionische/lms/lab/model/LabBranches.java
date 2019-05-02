package com.bionische.lms.lab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_lab_branches")
public class LabBranches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	
	@NotNull
	private String branchName;
	
	@NotNull
	private int labId;
	
	@NotNull
	private String addressLine1;
	
	@NotNull
	private String addressLine2;
	
	@NotNull
	private String contactNo;
	
	@NotNull
	private int cityId;
	
	@NotNull
	private String pincode;
	
	@NotNull
	private int stateId;
	
	@NotNull
	private int isHomeServiceAvailable;
	
	@NotNull
	private int isUsed;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getIsHomeServiceAvailable() {
		return isHomeServiceAvailable;
	}

	public void setIsHomeServiceAvailable(int isHomeServiceAvailable) {
		this.isHomeServiceAvailable = isHomeServiceAvailable;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "LabBranches [branchId=" + branchId + ", branchName=" + branchName + ", labId=" + labId
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", contactNo=" + contactNo
				+ ", cityId=" + cityId + ", pincode=" + pincode + ", stateId=" + stateId + ", isHomeServiceAvailable="
				+ isHomeServiceAvailable + ", isUsed=" + isUsed + "]";
	}
	
	

}
