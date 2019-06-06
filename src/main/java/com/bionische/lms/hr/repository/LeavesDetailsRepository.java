package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.LeavesDetails;

public interface LeavesDetailsRepository extends JpaRepository<LeavesDetails, Integer>{

	LeavesDetails save(LeavesDetails leavesDetails);
}
