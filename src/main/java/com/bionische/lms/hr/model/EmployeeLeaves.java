package com.bionische.lms.hr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_employee_leaves")
public class EmployeeLeaves {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",length=11)
	private int id;
	
	@NotNull
	@Column(name="leave_id",length=11)
	private int leaveId;
	
	@NotNull
	@Column(name="emp_id",length=11)
	private int empId;
	
	@NotBlank
	@Column(name="start_date")
	private Date startDate;
	
	@NotBlank
	@Column(name="end_date")
	private Date endDate;

	@NotBlank
	@Column(name="total_days",length=11)
	private float totalDays;
	
	@NotNull
	@Column(name="status",length=11)
	private int status;

 
	@Column(name="remark",length=200)
	private String remark;
	
	
	@NotNull
	@Column(name="approved_by",length=11)
	private int approvedBy;
	
	
	@NotNull
	@Column(name="responsible_emp_id",length=11)
	private int responsibleEmpId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(float totalDays) {
		this.totalDays = totalDays;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(int approvedBy) {
		this.approvedBy = approvedBy;
	}

	public int getResponsibleEmpId() {
		return responsibleEmpId;
	}

	public void setResponsibleEmpId(int responsibleEmpId) {
		this.responsibleEmpId = responsibleEmpId;
	}

	@Override
	public String toString() {
		return "EmployeeLeaves [id=" + id + ", leaveId=" + leaveId + ", empId=" + empId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", totalDays=" + totalDays + ", status=" + status + ", remark=" + remark
				+ ", approvedBy=" + approvedBy + ", responsibleEmpId=" + responsibleEmpId + "]";
	}

 
	 
}
