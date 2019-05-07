package com.bionische.lms.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.test.model.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

	Test save(Test test);

	List<Test> findByIsUsed(int isUsed);
	@Transactional
	@Modifying
	@Query("UPDATE Test  SET isUsed =:isUsed WHERE testId=:testId")
	int updateTestIsUsedStatus(@Param("testId")int testId,@Param("isUsed")int isUsed);

	@Query(value=" SELECT t.* from m_test t, m_lab_available_test_header th where th.branch_id=:branchId AND t.test_id=th.test_id AND th.is_used=1 AND t.is_used=1 ",nativeQuery=true)
	List<Test> getAvailableTestByBranchId(@Param("branchId")int branchId);
	 
}
