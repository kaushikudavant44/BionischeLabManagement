package com.bionische.lms.hr.model;

public class PayScale {

		
	private int gradeId;
	
	private String gradeName;
	
	private float gradeBasic;

	private float gradeTa;
	
	private float gradeHra;
	
	private float gradeBonus;
	
	private float gradePf;
	
	private float gradePt;

	
	
	
	
	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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

	@Override
	public String toString() {
		return "PayScale [gradeId=" + gradeId + ", gradeName=" + gradeName + ", gradeBasic=" + gradeBasic + ", gradeTa="
				+ gradeTa + ", gradeHra=" + gradeHra + ", gradeBonus=" + gradeBonus + ", gradePf=" + gradePf
				+ ", gradePt=" + gradePt + "]";
	}
	
	
	
	

}
