package com.bionische.lms.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.test.model.TestFactors;

public interface TestFactorsRepository extends JpaRepository<TestFactors, Integer>{

	TestFactors save(TestFactors testFactors);

	@Transactional
	@Modifying
	@Query("UPDATE TestFactors  SET isUsed =:isUsed WHERE factorId=:factorId")
	int updateTestFactorsIsUsedStatus(@Param("factorId")int factorId,@Param("isUsed")int isUsed);
	 
	List<TestFactors> findByIsUsed(int isUsed);
}
