package com.bionische.lms.lab.model;

import com.bionische.lms.util.Info;

public class LabStaffLogin {

	private LabStaff labStaff;
	private Info info;
	public LabStaff getLabStaff() {
		return labStaff;
	}
	public void setLabStaff(LabStaff labStaff) {
		this.labStaff = labStaff;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "LabStaffLogin [labStaff=" + labStaff + ", info=" + info + "]";
	}
	
	
}
