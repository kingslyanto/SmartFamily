package com.ke.family.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ke.family.dao.OccupationDao;
import com.ke.family.model.OccupationModel;
import com.ke.family.service.OccupationService;

@Service
public class OccupationServiceImpl implements OccupationService{
	@Autowired
	OccupationDao occupationDao;
	public OccupationModel saveOccupation(OccupationModel occupationModel) {
		return occupationDao.saveOccupation(occupationModel);
	}
}
