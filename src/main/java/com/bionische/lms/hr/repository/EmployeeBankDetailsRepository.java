package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.EmployeeBankDetails;

public interface EmployeeBankDetailsRepository extends JpaRepository<EmployeeBankDetails, Integer>{

	EmployeeBankDetails save(EmployeeBankDetails employeeBankDetails);
}
