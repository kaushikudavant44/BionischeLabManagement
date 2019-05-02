package com.bionische.lms.lab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_lab")
public class Lab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int labId;
	
	@NotNull
	private int labNo;
	
	@NotNull
	private String labLicenseNo;
	
	@NotNull
	private String labLicenseCertificate;
	
	@NotNull
	private String labGstNo;
	
	@NotNull
	private String labLogo;
	
	@NotNull
	private int labStatus;
	
	@NotNull
	private int isUsed;

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public int getLabNo() {
		return labNo;
	}

	public void setLabNo(int labNo) {
		this.labNo = labNo;
	}

	public String getLabLicenseNo() {
		return labLicenseNo;
	}

	public void setLabLicenseNo(String labLicenseNo) {
		this.labLicenseNo = labLicenseNo;
	}

	public String getLabLicenseCertificate() {
		return labLicenseCertificate;
	}

	public void setLabLicenseCertificate(String labLicenseCertificate) {
		this.labLicenseCertificate = labLicenseCertificate;
	}

	public String getLabGstNo() {
		return labGstNo;
	}

	public void setLabGstNo(String labGstNo) {
		this.labGstNo = labGstNo;
	}

	public String getLabLogo() {
		return labLogo;
	}

	public void setLabLogo(String labLogo) {
		this.labLogo = labLogo;
	}

	public int getLabStatus() {
		return labStatus;
	}

	public void setLabStatus(int labStatus) {
		this.labStatus = labStatus;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "MasterLab [labId=" + labId + ", labNo=" + labNo + ", labLicenseNo=" + labLicenseNo
				+ ", labLicenseCertificate=" + labLicenseCertificate + ", labGstNo=" + labGstNo + ", labLogo=" + labLogo
				+ ", labStatus=" + labStatus + ", isUsed=" + isUsed + "]";
	}
	
	

	
}
