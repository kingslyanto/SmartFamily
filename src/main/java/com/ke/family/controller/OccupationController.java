package com.ke.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ke.family.model.OccupationModel;
import com.ke.family.service.OccupationService;

@RestController
@RequestMapping("/occupation")

public class OccupationController {

	
	@Autowired
	OccupationService occupationService;
	@PostMapping("/saveoccupation")
	public OccupationModel saveOccupation(@RequestBody OccupationModel occupationModel ) {
		return occupationService.saveOccupation(occupationModel);
	}

}
