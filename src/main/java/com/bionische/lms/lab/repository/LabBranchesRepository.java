package com.bionische.lms.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.lab.model.LabBranches;

public interface LabBranchesRepository extends JpaRepository<LabBranches, Integer>{

	LabBranches save(LabBranches labBranches);
	
	
	List<LabBranches> findByLabIdAndIsUsed(int labId, int isUsed);

	@Transactional
	@Modifying
	@Query("UPDATE LabBranches  SET isUsed =:isUsed WHERE branchId=:branchId")
	int updateLabBranchIsUsedStatus(@Param("branchId")int branchId,@Param("isUsed")int isUsed);


	LabBranches findByBranchIdAndIsUsed(int branchId, int isUsed);
 
	
	
}
