package com.bionische.lms.master.service;

import java.util.List;

import javax.validation.Valid;

import com.bionische.lms.demo.model.Item;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.test.model.Test;
import com.bionische.lms.test.model.TestDetails;
import com.bionische.lms.test.model.TestFactors;
import com.bionische.lms.util.Info;

public interface MasterService {

	public TestFactors addTestFactors(@Valid TestFactors testFactors);

	public Info updateTestFactorsIsUsedStatus(int factorId, int isUsed);

	public List<TestFactors> gatAllTestFactors();

	Test addTest(Test test);

	public List<Test> gatAllTest();

	public List<TestDetails> gatAllTestDetailsByTestId(int testId);

	public Info updateTestIsUsedStatus(int testId, int isUsed);

	public Info updateTestDetailsIsUsedStatus(int testDetailsId, int isUsed);
 
}
