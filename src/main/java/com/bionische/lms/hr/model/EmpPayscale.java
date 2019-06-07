package com.bionische.lms.hr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_emp_payscale")
public class EmpPayscale {

		
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payscale_id;
	@NotNull
	private int empId;
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
	private float gradePerHour;
	@NotNull
	private float gradeGrossSalary;
	@NotNull
	private float gradeNetSalary;
	
	@NotNull
	private int isUsed;
	
	public int getPayscale_id() {
		return payscale_id;
	}
	public void setPayscale_id(int payscale_id) {
		this.payscale_id = payscale_id;
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
	public float getGradePerHour() {
		return gradePerHour;
	}
	public void setGradePerHour(float gradePerHour) {
		this.gradePerHour = gradePerHour;
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "EmpPayscale [payscale_id=" + payscale_id + ", empId=" + empId + ", gradeBasic=" + gradeBasic
				+ ", gradeTa=" + gradeTa + ", gradeHra=" + gradeHra + ", gradeBonus=" + gradeBonus + ", gradeOther="
				+ gradeOther + ", gradePf=" + gradePf + ", gradePt=" + gradePt + ", graduity=" + graduity
				+ ", mediclaim=" + mediclaim + ", gradePerHour=" + gradePerHour + ", gradeGrossSalary="
				+ gradeGrossSalary + ", gradeNetSalary=" + gradeNetSalary + ", isUsed=" + isUsed + "]";
	}
 

}
