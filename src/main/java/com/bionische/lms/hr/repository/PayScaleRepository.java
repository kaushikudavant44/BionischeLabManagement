package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.PayScale;

public interface PayScaleRepository extends JpaRepository<PayScale, Integer>{

	PayScale save(PayScale payScale);
}
