

package com.bionische.lms.hr.model;

public class EmployeeDetails {
	
	private int empId;
	
	private int payScaleId;

	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + "]";
	}
	

	

}
