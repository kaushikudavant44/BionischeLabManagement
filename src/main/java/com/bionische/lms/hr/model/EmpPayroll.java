package com.bionische.lms.hr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_emp_payroll")
public class EmpPayroll {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payroll_id;
	@NotNull
	private int month;
	@NotNull
	private int year;
	 
	private Date datetime;
	@NotNull
	private int empId;
	@NotNull
	private int totalWorkingDays;
	@NotNull
	private int totalPresentDays;
	@NotNull
	private int totalLeaves;
	@NotNull
	private int unpaidLeave;
	@NotNull
	private float gradeBasic;
	@NotNull
	private float gradeTa;
	@NotNull
	private float gradeHra;
	@NotNull
	private float gradeBonus;
	@NotNull
	private float gradeOther;
	@NotNull
	private float gradePf;
	@NotNull
	private float gradePt;
	@NotNull
	private float graduity;
	@NotNull
	private float mediclaim;
	@NotNull
	private float deduction;
	@NotNull
	private float gradeGrossSalary;
	@NotNull
	private float gradeNetSalary;
	
	@NotNull
	private int isUsed;

	public int getPayroll_id() {
		return payroll_id;
	}

	public void setPayroll_id(int payroll_id) {
		this.payroll_id = payroll_id;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}

	public int getTotalPresentDays() {
		return totalPresentDays;
	}

	public void setTotalPresentDays(int totalPresentDays) {
		this.totalPresentDays = totalPresentDays;
	}

	public int getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(int totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public int getUnpaidLeave() {
		return unpaidLeave;
	}

	public void setUnpaidLeave(int unpaidLeave) {
		this.unpaidLeave = unpaidLeave;
	}

	public float getGradeBasic() {
		return gradeBasic;
	}

	public void setGradeBasic(float gradeBasic) {
		this.gradeBasic = gradeBasic;
	}

	public float getGradeTa() {
		return gradeTa;
	}

	public void setGradeTa(float gradeTa) {
		this.gradeTa = gradeTa;
	}

	public float getGradeHra() {
		return gradeHra;
	}

	public void setGradeHra(float gradeHra) {
		this.gradeHra = gradeHra;
	}

	public float getGradeBonus() {
		return gradeBonus;
	}

	public void setGradeBonus(float gradeBonus) {
		this.gradeBonus = gradeBonus;
	}

	public float getGradeOther() {
		return gradeOther;
	}

	public void setGradeOther(float gradeOther) {
		this.gradeOther = gradeOther;
	}

	public float getGradePf() {
		return gradePf;
	}

	public void setGradePf(float gradePf) {
		this.gradePf = gradePf;
	}

	public float getGradePt() {
		return gradePt;
	}

	public void setGradePt(float gradePt) {
		this.gradePt = gradePt;
	}

	public float getGraduity() {
		return graduity;
	}

	public void setGraduity(float graduity) {
		this.graduity = graduity;
	}

	public float getMediclaim() {
		return mediclaim;
	}

	public void setMediclaim(float mediclaim) {
		this.mediclaim = mediclaim;
	}

	public float getDeduction() {
		return deduction;
	}

	public void setDeduction(float deduction) {
		this.deduction = deduction;
	}

	public float getGradeGrossSalary() {
		return gradeGrossSalary;
	}

	public void setGradeGrossSalary(float gradeGrossSalary) {
		this.gradeGrossSalary = gradeGrossSalary;
	}

	public float getGradeNetSalary() {
		return gradeNetSalary;
	}

	public void setGradeNetSalary(float gradeNetSalary) {
		this.gradeNetSalary = gradeNetSalary;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "EmpPayroll [payroll_id=" + payroll_id + ", month=" + month + ", year=" + year + ", datetime=" + datetime
				+ ", empId=" + empId + ", totalWorkingDays=" + totalWorkingDays + ", totalPresentDays="
				+ totalPresentDays + ", totalLeaves=" + totalLeaves + ", unpaidLeave=" + unpaidLeave + ", gradeBasic="
				+ gradeBasic + ", gradeTa=" + gradeTa + ", gradeHra=" + gradeHra + ", gradeBonus=" + gradeBonus
				+ ", gradeOther=" + gradeOther + ", gradePf=" + gradePf + ", gradePt=" + gradePt + ", graduity="
				+ graduity + ", mediclaim=" + mediclaim + ", deduction=" + deduction + ", gradeGrossSalary="
				+ gradeGrossSalary + ", gradeNetSalary=" + gradeNetSalary + ", isUsed=" + isUsed + "]";
	}
	
	 
}
