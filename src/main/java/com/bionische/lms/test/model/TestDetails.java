package com.bionische.lms.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "m_test_details")
public class TestDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long testDetailsId;

	@NotNull
	private Long testId;

	@NotNull
	private int factorId;

	@NotNull
	private int isUsed;

	public Long getTestDetailsId() {
		return testDetailsId;
	}

	public void setTestDetailsId(Long testDetailsId) {
		this.testDetailsId = testDetailsId;
	}

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	 
	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public int getFactorId() {
		return factorId;
	}

	public void setFactorId(int factorId) {
		this.factorId = factorId;
	}

	@Override
	public String toString() {
		return "TestDetails [testDetailsId=" + testDetailsId + ", testId=" + testId + ", factorId=" + factorId
				+ ", isUsed=" + isUsed + "]";
	}
 

	
}
