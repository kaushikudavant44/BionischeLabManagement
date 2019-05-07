package com.bionische.lms.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.test.model.TestDetails;

public interface TestDetailsRepository extends JpaRepository<TestDetails, Integer>{

	TestDetails save(TestDetails testDetails);

	List<TestDetails> findByTestIdAndIsUsed(int testId, int isUsed);
	
	@Transactional
	@Modifying
	@Query("UPDATE TestDetails  SET isUsed =:isUsed WHERE testDetailsId=:testDetailsId")
	int updateTestDetailsIsUsedStatus(@Param("testDetailsId")int testDetailsId,@Param("isUsed")int isUsed);
} 
