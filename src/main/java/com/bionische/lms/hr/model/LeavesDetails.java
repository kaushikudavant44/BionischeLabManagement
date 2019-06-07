package com.bionische.lms.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_leaves_details")
public class LeavesDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leave_id",length=11)
	private int leaveId;
	
	@NotBlank
	@Column(name="leave_name",length=100)
	private String leaveName;

	@NotNull
	@Column(name="job_id",length=11)
	private int jobId;
	
	@NotNull
	@Column(name="days",length=11)
	private int days;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getLeaveName() {
		return leaveName;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "LeavesDetails [leaveId=" + leaveId + ", leaveName=" + leaveName + ", jobId=" + jobId + ", days=" + days
				+ "]";
	}

	 
}
