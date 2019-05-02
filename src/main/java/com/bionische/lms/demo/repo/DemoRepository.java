


package com.bionische.lms.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bionische.lms.demo.model.Item;

@Repository
public interface DemoRepository extends JpaRepository<Item, Long> {

	@Modifying()
	@Query(value=":test", nativeQuery=true)
	List<Item> strQuery(@Param("test") char[] test);

	Item findByItemId(Long itemId);
	
	

}
