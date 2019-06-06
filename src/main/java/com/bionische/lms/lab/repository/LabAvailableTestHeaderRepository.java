package com.bionische.lms.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.lab.model.LabAvailableTestHeader;

public interface LabAvailableTestHeaderRepository extends JpaRepository<LabAvailableTestHeader, Integer>{

	LabAvailableTestHeader save(LabAvailableTestHeader labAvailableTestHeader);
	

	@Transactional
	@Modifying
	@Query("UPDATE LabAvailableTestHeader  SET isUsed =:isUsed WHERE branchId=:branchId AND testId=:testId")
	int updateAvailableTestIsUsedStatusByBranchIdAndTestId(@Param("branchId")int branchId,@Param("testId")int testId,@Param("isUsed")int isUsed);
	 
}
