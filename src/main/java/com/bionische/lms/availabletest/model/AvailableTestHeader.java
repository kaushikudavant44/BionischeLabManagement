package com.bionische.lms.availabletest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_lab_available_test_details")
public class AvailableTestHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int detailId;
	
	@NotNull
	private int testHeaderId;
	
	@NotNull
	private int testId;
	
	@NotNull
	private int is_used;

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public int getTestHeaderId() {
		return testHeaderId;
	}

	public void setTestHeaderId(int testHeaderId) {
		this.testHeaderId = testHeaderId;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getIs_used() {
		return is_used;
	}

	public void setIs_used(int is_used) {
		this.is_used = is_used;
	}

	@Override
	public String toString() {
		return "AvailableTestHeader [detailId=" + detailId + ", testHeaderId=" + testHeaderId + ", testId=" + testId
				+ ", is_used=" + is_used + "]";
	}
	
	

}
