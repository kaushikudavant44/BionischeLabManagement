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
@Table(name="t_employee_bank_details")
public class EmployeeBankDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",length=11)
	private int id;
	
	@NotNull
	@Column(name="emp_id",length=11)
	private int empId;
	
	@NotBlank
	@Column(name="bank_name",length=100)
	private String bankName;
	
	@NotBlank
	@Column(name="branch",length=100)
	private String branch;
	
	@NotBlank
	@Column(name="ifsc",length=100)
	private String ifsc;
	
	@NotBlank
	@Column(name="pan_no",length=100)
	private String panNo;
	
	@NotBlank
	@Column(name="acc_no",length=100)
	private String accNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "EmployeeBankDetails [id=" + id + ", empId=" + empId + ", bankName=" + bankName + ", branch=" + branch
				+ ", ifsc=" + ifsc + ", panNo=" + panNo + ", accNo=" + accNo + "]";
	}

	 
	
	
}
