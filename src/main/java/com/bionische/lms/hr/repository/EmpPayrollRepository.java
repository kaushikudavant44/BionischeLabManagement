package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.EmpPayroll;

public interface EmpPayrollRepository extends JpaRepository<EmpPayroll, Integer>{

	
	EmpPayroll save(EmpPayroll empPayroll);
}
