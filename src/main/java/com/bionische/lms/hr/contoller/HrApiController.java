package com.bionische.lms.hr.contoller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.lms.hr.model.DepartmentDetails;
import com.bionische.lms.hr.model.EmpPayroll;
import com.bionische.lms.hr.model.EmpPayscale;
import com.bionische.lms.hr.model.EmployeeBankDetails;
import com.bionische.lms.hr.model.EmployeeLeaves;
import com.bionische.lms.hr.model.JobDetails;
import com.bionische.lms.hr.model.LeavesDetails;
import com.bionische.lms.hr.model.PayScale;
import com.bionische.lms.hr.service.HrMasterService;
import com.bionische.lms.util.ApiVersion;

@RestController
@RequestMapping("/api/hr")
@ApiVersion(1)
public class HrApiController {

	
	Logger logger = LoggerFactory.getLogger(HrApiController.class);
	@Autowired
	HrMasterService hrMasterService;
	
	
	@PostMapping("/addLeavesDetails")
	public LeavesDetails addLeavesDetails(@Valid @RequestBody LeavesDetails leavesDetails) {
		return hrMasterService.addLeavesDetails(leavesDetails);
	}
	
	@PostMapping("/addJobDetails")
	public JobDetails addLeavesDetails(@Valid @RequestBody JobDetails jobDetails) {
		return hrMasterService.addJobDetails(jobDetails);
	}
	
	@PostMapping("/addDepartmentDetails")
	public DepartmentDetails addDepartmentDetails(@Valid @RequestBody DepartmentDetails departmentDetails) {
		return hrMasterService.addDepartmentDetails(departmentDetails);
	}
	
	@PostMapping("/addEmployeeLeaves")
	public EmployeeLeaves addEmployeeLeaves(@Valid @RequestBody EmployeeLeaves employeeLeaves) {
		return hrMasterService.addEmployeeLeaves(employeeLeaves);
	}
	
	@PostMapping("/addEmployeeBankDetails")
	public EmployeeBankDetails addEmployeeBankDetails(@Valid @RequestBody EmployeeBankDetails employeeBankDetails) {
		return hrMasterService.addEmployeeBankDetails(employeeBankDetails);
	}
	@PostMapping("/addPayScaleDetails")
	public PayScale addPayScaleDetails(@Valid @RequestBody PayScale payScale) {
		return hrMasterService.addPayScaleDetails(payScale);
	}
	
	@PostMapping("/addEmpPayscale")
	public EmpPayscale addEmpPayscale(@Valid @RequestBody EmpPayscale empPayscale) {
		return hrMasterService.addEmpPayscale(empPayscale);
	}
	
	@PostMapping("/addEmpPayroll")
	public EmpPayroll addEmpPayroll(@Valid @RequestBody EmpPayroll empPayroll) {
		return hrMasterService.addEmpPayroll(empPayroll);
	}
}
