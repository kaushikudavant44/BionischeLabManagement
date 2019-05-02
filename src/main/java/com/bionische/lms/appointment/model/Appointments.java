package com.bionische.lms.appointment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_lab_branches")
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;
	
	@NotNull
	private int appointmentNo;
	
	@NotNull
	private int labId;
	
	@NotNull
	private int branchId;
	
	@NotNull
	private int patientId;
	
	@NotNull
	private Date appointmentDate;
	
	@NotNull
	private String appointmentTime;
	
	@NotNull
	private int appoinmentType;
	
	@NotNull
	private int appointmentStatus;
	
	@NotNull
	private int isUsed;

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
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

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public int getAppoinmentType() {
		return appoinmentType;
	}

	public void setAppoinmentType(int appoinmentType) {
		this.appoinmentType = appoinmentType;
	}

	public int getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(int appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "Appointments [appointmentId=" + appointmentId + ", appointmentNo=" + appointmentNo + ", labId=" + labId
				+ ", branchId=" + branchId + ", patientId=" + patientId + ", appointmentDate=" + appointmentDate
				+ ", appointmentTime=" + appointmentTime + ", appoinmentType=" + appoinmentType + ", appointmentStatus="
				+ appointmentStatus + ", isUsed=" + isUsed + "]";
	}
	
	

}
