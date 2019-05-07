package com.bionische.lms.master.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bionische.lms.test.model.Test;
import com.bionische.lms.test.model.TestDetails;
import com.bionische.lms.test.model.TestFactors;
import com.bionische.lms.test.repository.TestDetailsRepository;
import com.bionische.lms.test.repository.TestFactorsRepository;
import com.bionische.lms.test.repository.TestRepository;
import com.bionische.lms.util.Info;

public class MasterServiceImpl implements MasterService{

	Logger logger = LoggerFactory.getLogger(MasterServiceImpl.class);
	@Autowired
	TestFactorsRepository testFactorsRepository;
	@Autowired
	TestRepository testRepository;
	@Autowired
	TestDetailsRepository testDetailsRepository;
	
	@Override
	public TestFactors addTestFactors(  TestFactors testFactors) {
		return testFactorsRepository.save(testFactors);
	}
	@Override
	public Info updateTestFactorsIsUsedStatus(int factorId, int isUsed) {
		Info info=new Info();
		info.setError(true);
		int res=testFactorsRepository.updateTestFactorsIsUsedStatus(factorId, isUsed);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("Lab update Test Factors isUsed Status");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to update Test Factors isUsed Status");
		}
		return info;
	}
	@Override
	public List<TestFactors> gatAllTestFactors() {
		return testFactorsRepository.findByIsUsed(1);
	}
	

	@Override
	public Test addTest(  Test test) {
		Test testRes= testRepository.save(test);
		for(int i=0;i<test.getTestDetailsList().size();i++) {
			test.getTestDetailsList().get(i).setTestId(testRes.getTestId());
			testDetailsRepository.save(test.getTestDetailsList().get(i));
		}
		 return testRes;
	}
	@Override
	public List<Test> gatAllTest() {
		return testRepository.findByIsUsed(1);
	}
	 

		@Override
		public List<TestDetails> gatAllTestDetailsByTestId(int testId) {
			return testDetailsRepository.findByTestIdAndIsUsed(testId,1);
		}
		@Override
		public Info updateTestIsUsedStatus(int testId, int isUsed) {
			Info info=new Info();
			info.setError(true);
			int res=testRepository.updateTestIsUsedStatus(testId, isUsed);
			if(res>0)
			{
				info.setError(false);
				info.setMessage("Lab update Test isUsed Status");
			}
			else {
				info.setError(true);
				info.setMessage("Failed to update Test isUsed Status");
			}
			return info;
		}
		@Override
		public Info updateTestDetailsIsUsedStatus(int testDetailsId, int isUsed) {
			Info info=new Info();
			info.setError(true);
			int res=testDetailsRepository.updateTestDetailsIsUsedStatus(testDetailsId, isUsed);
			if(res>0)
			{
				info.setError(false);
				info.setMessage("Lab update Test details isUsed Status");
			}
			else {
				info.setError(true);
				info.setMessage("Failed to update Test details isUsed Status");
			}
			return info;
		}
		 
	
}
