package com.bionische.lms.lab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="m_lab_staff")
public class LabStaff {	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	
	@NotNull
	private int labId;
	
	@NotNull
	private int branchId;
	
	@NotNull
	private String staffName;
	
	@NotNull
	private String staffMobile;
	
	@NotNull
	private int staffRoleId;
	
	@NotNull
	private int isUsed;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffMobile() {
		return staffMobile;
	}

	public void setStaffMobile(String staffMobile) {
		this.staffMobile = staffMobile;
	}

	public int getStaffRoleId() {
		return staffRoleId;
	}

	public void setStaffRoleId(int staffRoleId) {
		this.staffRoleId = staffRoleId;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "LabStaff [staffId=" + staffId + ", labId=" + labId + ", branchId=" + branchId + ", staffName="
				+ staffName + ", staffMobile=" + staffMobile + ", staffRoleId=" + staffRoleId + ", isUsed=" + isUsed
				+ "]";
	}
	
	

}
