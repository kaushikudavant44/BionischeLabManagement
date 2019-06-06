package com.bionische.lms.hr.service;

import javax.validation.Valid;

import com.bionische.lms.hr.model.DepartmentDetails;
import com.bionische.lms.hr.model.EmpPayroll;
import com.bionische.lms.hr.model.EmpPayscale;
import com.bionische.lms.hr.model.EmployeeBankDetails;
import com.bionische.lms.hr.model.EmployeeLeaves;
import com.bionische.lms.hr.model.JobDetails;
import com.bionische.lms.hr.model.LeavesDetails;
import com.bionische.lms.hr.model.PayScale;

public interface HrMasterService {

	LeavesDetails addLeavesDetails( LeavesDetails leavesDetails);

	JobDetails addJobDetails(JobDetails jobDetails);

	DepartmentDetails addDepartmentDetails( DepartmentDetails departmentDetails);

	EmployeeLeaves addEmployeeLeaves( EmployeeLeaves employeeLeaves);

	EmployeeBankDetails addEmployeeBankDetails( EmployeeBankDetails employeeBankDetails);

	PayScale addPayScaleDetails(PayScale payScale);

	EmpPayscale addEmpPayscale(EmpPayscale empPayscale);

	EmpPayroll addEmpPayroll( EmpPayroll empPayroll);

	
}
