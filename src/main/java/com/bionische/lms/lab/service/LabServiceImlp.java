package com.bionische.lms.lab.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.lab.repository.LabRepository;
import com.bionische.lms.util.Info;

@Service
public class LabServiceImlp implements LabService {

	Logger logger = LoggerFactory.getLogger(LabServiceImlp.class);
	@Autowired
	private LabRepository labRepository;

	@Override
	public Lab addLab(Lab lab) {
		return labRepository.save(lab);
	}

	@Override
	public Info updateLabIsUsedStatus(int labId, int isUsed) {

		Info info=new Info();
		info.setError(true);
		int res=labRepository.updateLabIsUsedStatus(labId, isUsed);
		if(res>0)
		{
			info.setError(false);
			info.setMessage("Lab Register Successfully");
		}
		else {
			info.setError(true);
			info.setMessage("Failed to register Lab ");
		}
		return info;
	}

	@Override
	public List<Lab> gatAllLab() {
	 
		return labRepository.findByIsUsed(0);
	}

	@Override
	public Lab getLabByLabId( int labId) {
		try {
		return	labRepository.findByLabIdAndIsUsed(labId, 0);
	 
		}
		catch (Exception e) {
			  logger.error("Lab Details not found!", e);
			return null;
		}
	}

}
