package com.bionische.lms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.hr.model.JobDetails;

public interface JobDetailsRepository extends JpaRepository<JobDetails, Integer>{

	JobDetails save(JobDetails jobDetails);
}
