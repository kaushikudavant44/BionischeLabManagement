package com.bionische.lms.hr.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionische.lms.hr.model.DepartmentDetails;
import com.bionische.lms.hr.model.EmpPayroll;
import com.bionische.lms.hr.model.EmpPayscale;
import com.bionische.lms.hr.model.EmployeeBankDetails;
import com.bionische.lms.hr.model.EmployeeLeaves;
import com.bionische.lms.hr.model.JobDetails;
import com.bionische.lms.hr.model.LeavesDetails;
import com.bionische.lms.hr.model.PayScale;
import com.bionische.lms.hr.repository.DepartmentDetailsRepository;
import com.bionische.lms.hr.repository.EmpPayrollRepository;
import com.bionische.lms.hr.repository.EmpPayscaleRepository;
import com.bionische.lms.hr.repository.EmployeeBankDetailsRepository;
import com.bionische.lms.hr.repository.EmployeeLeavesRepository;
import com.bionische.lms.hr.repository.JobDetailsRepository;
import com.bionische.lms.hr.repository.LeavesDetailsRepository;
import com.bionische.lms.hr.repository.PayScaleRepository;
@Service
public class HrMasterServiceImpl implements HrMasterService{

	Logger logger = LoggerFactory.getLogger(HrMasterServiceImpl.class);
	
	@Autowired
	LeavesDetailsRepository leavesDetailsRepository;
	@Autowired
	JobDetailsRepository jobDetailsRepository;
	@Autowired
	DepartmentDetailsRepository departmentDetailsRepository;
	@Autowired
	EmployeeLeavesRepository employeeLeavesRepository;
	@Autowired
	EmployeeBankDetailsRepository employeeBankDetailsRepository;
	@Autowired
	PayScaleRepository payScaleRepository;
	@Autowired
	EmpPayscaleRepository empPayscaleRepository;
	@Autowired
	EmpPayrollRepository empPayrollRepository;
	
	@Override
	public LeavesDetails addLeavesDetails(LeavesDetails leavesDetails) {
		 
		return leavesDetailsRepository.save(leavesDetails);
	}


	@Override
	public JobDetails addJobDetails(JobDetails jobDetails) {
		// TODO Auto-generated method stub
		return jobDetailsRepository.save(jobDetails);
	}


	@Override
	public DepartmentDetails addDepartmentDetails(DepartmentDetails departmentDetails) {
	 
		return departmentDetailsRepository.save(departmentDetails);
	}


	@Override
	public EmployeeLeaves addEmployeeLeaves(EmployeeLeaves employeeLeaves) {
		 
		return employeeLeavesRepository.save(employeeLeaves);
	}


	@Override
	public EmployeeBankDetails addEmployeeBankDetails(EmployeeBankDetails employeeBankDetails) {
		 
		return employeeBankDetailsRepository.save(employeeBankDetails);
	}


	@Override
	public PayScale addPayScaleDetails(PayScale payScale) {
	 
		return payScaleRepository.save(payScale);
	}


	@Override
	public EmpPayscale addEmpPayscale(EmpPayscale empPayscale) {
		 
		return empPayscaleRepository.save(empPayscale);
	}


	@Override
	public EmpPayroll addEmpPayroll(EmpPayroll empPayroll) {
	 
		return empPayrollRepository.save(empPayroll);
	}


	@Override
	public List<JobDetails> getAllJobDetails() {
		 
		return jobDetailsRepository.findAll();
	}


	@Override
	public List<DepartmentDetails> getDeptDetails() {
		 
		return departmentDetailsRepository.findAll();
	}

	
}
