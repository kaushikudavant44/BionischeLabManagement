package com.bionische.lms.test.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "m_test")
public class Test {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long testId;


	    
	    @NotBlank
	    private  String testName;
	  
	    @NotBlank
	    private  String testDescription;
	    
	    @NotNull
	    private int isUsed;
	    
	    @Transient
	    List<TestDetails> testDetailsList;
	    

		public Long getTestId() {
			return testId;
		}

		public void setTestId(Long testId) {
			this.testId = testId;
		}

		public String getTestName() {
			return testName;
		}

		public void setTestName(String testName) {
			this.testName = testName;
		}

		public String getTestDescription() {
			return testDescription;
		}

		public void setTestDescription(String testDescription) {
			this.testDescription = testDescription;
		}

		public int getIsUsed() {
			return isUsed;
		}

		public void setIsUsed(int isUsed) {
			this.isUsed = isUsed;
		}

		public List<TestDetails> getTestDetailsList() {
			return testDetailsList;
		}

		public void setTestDetailsList(List<TestDetails> testDetailsList) {
			this.testDetailsList = testDetailsList;
		}

		@Override
		public String toString() {
			return "Test [testId=" + testId + ", testName=" + testName + ", testDescription=" + testDescription
					+ ", isUsed=" + isUsed + ", testDetailsList=" + testDetailsList + "]";
		}

		 
		 
	    
	    
}
