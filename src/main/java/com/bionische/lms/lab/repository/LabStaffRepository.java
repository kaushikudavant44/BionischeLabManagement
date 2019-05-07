package com.bionische.lms.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.lab.model.LabStaff;

public interface LabStaffRepository extends JpaRepository<LabStaff, Integer>{

	
	LabStaff save(LabStaff labStaff);
	
	@Transactional
	@Modifying
	@Query("UPDATE LabStaff  SET isUsed =:isUsed WHERE staffId=:staffId")
	int updateLabStaffIsUsedStatus(@Param("staffId")int staffId,@Param("isUsed")int isUsed);

	@Transactional
	@Modifying
	@Query("UPDATE LabStaff  SET staffRoleId =:staffRoleId WHERE staffId=:staffId")
	int updateLabStaffRole(@Param("staffId")int staffId,@Param("staffRoleId")int staffRoleId);

	List<LabStaff> findByBranchIdAndIsUsed(int branchId, int isUsed);

	List<LabStaff> findByLabIdAndIsUsed(int labId, int isUsed);

	List<LabStaff> findByStaffNameContainingAndIsUsed(String staffName, int isUsed);

	LabStaff findByStaffMobileAndIsUsed(String staffMobile, int isUsed);
 
	 
}
