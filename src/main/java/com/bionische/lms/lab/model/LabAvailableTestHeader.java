package com.bionische.lms.lab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "m_lab_available_test_header")
public class LabAvailableTestHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long testHeaderId;

	@NotNull
	private int labId;

	@NotNull
	private int branchId;
	
	@NotNull
	private int testId;
	
	@NotNull
	private float cost;
	
	
	@NotNull
	private int isUsed;


	public Long getTestHeaderId() {
		return testHeaderId;
	}


	public void setTestHeaderId(Long testHeaderId) {
		this.testHeaderId = testHeaderId;
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


	public int getTestId() {
		return testId;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getIsUsed() {
		return isUsed;
	}


	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}


	@Override
	public String toString() {
		return "LabAvailableTestHeader [testHeaderId=" + testHeaderId + ", labId=" + labId + ", branchId=" + branchId
				+ ", testId=" + testId + ", cost=" + cost + ", isUsed=" + isUsed + "]";
	}

 

	
}
