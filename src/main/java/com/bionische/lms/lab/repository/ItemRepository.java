package com.bionische.lms.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.lms.demo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	Item save(Item item);

	@Transactional
	@Modifying
	@Query("UPDATE Item  SET isUsed =:isUsed WHERE itemId=:itemId")
	int updateItemIsUsedStatus(@Param("itemId")int itemId,@Param("isUsed")int isUsed);

	List<Item> findByBranchIdAndIsUsed(int branchId, int isUsed);
	 
}
