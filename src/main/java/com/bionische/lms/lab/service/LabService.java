package com.bionische.lms.lab.service;

import java.util.List;

import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.util.Info;

public interface LabService {

	
	public Lab addLab(Lab lab);
	
	public Info updateLabIsUsedStatus(int labId,int isUsed);

	public List<Lab> gatAllLab();

	public Lab getLabByLabId( int labId);
}
