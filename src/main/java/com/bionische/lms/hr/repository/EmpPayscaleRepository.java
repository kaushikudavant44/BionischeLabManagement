package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.EmpPayscale;

public interface EmpPayscaleRepository extends JpaRepository<EmpPayscale, Integer>{

	EmpPayscale save( EmpPayscale empPayscale);
}
