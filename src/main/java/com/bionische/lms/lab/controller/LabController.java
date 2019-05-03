package com.bionische.lms.lab.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.lms.exception.ResourceNotFoundException;
import com.bionische.lms.lab.model.Lab;
import com.bionische.lms.lab.repository.LabRepository;
import com.bionische.lms.lab.service.LabService;
import com.bionische.lms.util.ApiVersion;
import com.bionische.lms.util.Info;

@RestController
@RequestMapping("/api/lab")
@ApiVersion(1)
public class LabController {

	Logger logger = LoggerFactory.getLogger(LabController.class);
	@Autowired
	private LabRepository labRepository;
	@Autowired
	private LabService labService;

	@PostMapping("/addLab")
	public Lab addLab(@Valid @RequestBody Lab lab) {
		return labService.addLab(lab);
	}

	@PostMapping("/updateLabIsUsedStatus")
	public Info updateLabIsUsedStatus( @RequestParam("labId")int labId,@RequestParam("isUsed")int isUsed) {
		return labService.updateLabIsUsedStatus(labId,isUsed);
	}
	
	@GetMapping("/gatAllLab")
	public List<Lab> gatAllLab() {
		return labService.gatAllLab();
	}
	
	@PostMapping("/getLabByLabId")
	public ResponseEntity<Lab> getLabByLabId(@RequestParam ("labId")int labId) {
		Lab lab=labRepository.findByLabId(labId);
		if (lab == null) {
			throw new ResourceNotFoundException("Lab", "id", labId);
		} else {

			return new ResponseEntity<Lab>(lab, HttpStatus.OK);
		}
		
	 
	}
	
}
