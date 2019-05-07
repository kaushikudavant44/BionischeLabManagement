package com.bionische.lms.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.lab.model.LabAvailableTestHeader;

public interface LabAvailableTestHeaderRepository extends JpaRepository<LabAvailableTestHeader, Integer>{

	LabAvailableTestHeader save(LabAvailableTestHeader labAvailableTestHeader);
}
