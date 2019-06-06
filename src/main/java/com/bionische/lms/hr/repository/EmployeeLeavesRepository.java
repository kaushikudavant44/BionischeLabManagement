package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.EmployeeLeaves;

public interface EmployeeLeavesRepository extends JpaRepository<EmployeeLeaves, Integer>{

	
	EmployeeLeaves save(EmployeeLeaves employeeLeaves);
	
}
