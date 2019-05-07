package com.bionische.lms.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "m_test_factors")
public class TestFactors {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long factorId;

	    @NotNull
	    private int labId;
 
	    
	    @NotBlank
	    private  String factorName;
	    
	    @NotNull
	    private  float normalValueFromMale;
	    
	    @NotNull
	    private  float normalValueToMale;
	     
	    
	    @NotNull
	    private  float normalValueFromFemale;
	    
	    @NotNull
	    private  float normalValueToFemale;
	    
	    @NotNull
	    private  float normalValueFromChild;
	     
	    
	    @NotNull
	    private  float normalValueToChild;
	    
	    @NotNull
	    private  float normalValueFromBaby;
	     
	    
	    @NotNull
	    private  float normalValueToBaby;
	    
	    @NotBlank
	    private  String uom;
	    
	    @NotNull
	    private int isUsed;

		public Long getFactorId() {
			return factorId;
		}

		public void setFactorId(Long factorId) {
			this.factorId = factorId;
		}

		public int getLabId() {
			return labId;
		}

		public void setLabId(int labId) {
			this.labId = labId;
		}

		public String getFactorName() {
			return factorName;
		}

		public void setFactorName(String factorName) {
			this.factorName = factorName;
		}

		public float getNormalValueFromMale() {
			return normalValueFromMale;
		}

		public void setNormalValueFromMale(float normalValueFromMale) {
			this.normalValueFromMale = normalValueFromMale;
		}

		public float getNormalValueToMale() {
			return normalValueToMale;
		}

		public void setNormalValueToMale(float normalValueToMale) {
			this.normalValueToMale = normalValueToMale;
		}

		public float getNormalValueFromFemale() {
			return normalValueFromFemale;
		}

		public void setNormalValueFromFemale(float normalValueFromFemale) {
			this.normalValueFromFemale = normalValueFromFemale;
		}

		public float getNormalValueToFemale() {
			return normalValueToFemale;
		}

		public void setNormalValueToFemale(float normalValueToFemale) {
			this.normalValueToFemale = normalValueToFemale;
		}

		public float getNormalValueFromChild() {
			return normalValueFromChild;
		}

		public void setNormalValueFromChild(float normalValueFromChild) {
			this.normalValueFromChild = normalValueFromChild;
		}

		public float getNormalValueToChild() {
			return normalValueToChild;
		}

		public void setNormalValueToChild(float normalValueToChild) {
			this.normalValueToChild = normalValueToChild;
		}

		public float getNormalValueFromBaby() {
			return normalValueFromBaby;
		}

		public void setNormalValueFromBaby(float normalValueFromBaby) {
			this.normalValueFromBaby = normalValueFromBaby;
		}

		public float getNormalValueToBaby() {
			return normalValueToBaby;
		}

		public void setNormalValueToBaby(float normalValueToBaby) {
			this.normalValueToBaby = normalValueToBaby;
		}

		public String getUom() {
			return uom;
		}

		public void setUom(String uom) {
			this.uom = uom;
		}

		public int getIsUsed() {
			return isUsed;
		}

		public void setIsUsed(int isUsed) {
			this.isUsed = isUsed;
		}

		@Override
		public String toString() {
			return "TestFactors [factorId=" + factorId + ", labId=" + labId + ", factorName=" + factorName
					+ ", normalValueFromMale=" + normalValueFromMale + ", normalValueToMale=" + normalValueToMale
					+ ", normalValueFromFemale=" + normalValueFromFemale + ", normalValueToFemale="
					+ normalValueToFemale + ", normalValueFromChild=" + normalValueFromChild + ", normalValueToChild="
					+ normalValueToChild + ", normalValueFromBaby=" + normalValueFromBaby + ", normalValueToBaby="
					+ normalValueToBaby + ", uom=" + uom + ", isUsed=" + isUsed + "]";
		}

	    
}
