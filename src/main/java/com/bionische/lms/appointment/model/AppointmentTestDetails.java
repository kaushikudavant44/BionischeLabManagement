package com.bionische.lms.appointment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_appointment_test_details")
public class AppointmentTestDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appoinmentDetailsId;
	
	@NotNull
	private int appointmentId;
	
	@NotNull
	private int testId;

	public int getAppoinmentDetailsId() {
		return appoinmentDetailsId;
	}

	public void setAppoinmentDetailsId(int appoinmentDetailsId) {
		this.appoinmentDetailsId = appoinmentDetailsId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	@Override
	public String toString() {
		return "AppointmentTestDetails [appoinmentDetailsId=" + appoinmentDetailsId + ", appointmentId=" + appointmentId
				+ ", testId=" + testId + "]";
	}
	
	

}
