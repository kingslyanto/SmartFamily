package com.ke.family.dao;


import org.springframework.stereotype.Component;

import com.ke.family.model.OccupationModel;

@Component
public interface OccupationDao {

	public OccupationModel saveOccupation(OccupationModel occupationModel);
	
}
