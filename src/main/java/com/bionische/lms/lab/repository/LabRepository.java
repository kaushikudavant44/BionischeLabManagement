package com.bionische.lms.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.lab.model.Lab;

public interface LabRepository extends JpaRepository<Lab, Integer>{

	Lab save(Lab lab);
	
	@Transactional
	@Modifying
	@Query("UPDATE Lab  SET isUsed =:isUsed WHERE labId=:labId")
	int updateLabIsUsedStatus(@Param("labId")int labId,@Param("isUsed")int isUsed);

	List<Lab> findByIsUsed(int isUsed);

	Lab findByLabIdAndIsUsed( int labId, int isUsed);

	Lab findByLabId(int labId);
}