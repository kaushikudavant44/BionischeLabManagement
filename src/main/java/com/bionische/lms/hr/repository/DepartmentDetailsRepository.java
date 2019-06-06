package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.DepartmentDetails;

public interface DepartmentDetailsRepository extends JpaRepository<DepartmentDetails, Integer>{

	
	DepartmentDetails save(DepartmentDetails departmentDetails);
	
}
