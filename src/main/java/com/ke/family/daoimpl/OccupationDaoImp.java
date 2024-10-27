package com.ke.family.daoimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ke.family.dao.OccupationDao;
import com.ke.family.entity.OccupationEntity;
import com.ke.family.model.OccupationModel;
import com.ke.family.repository.OccupationRepository;
@Repository
public class OccupationDaoImp implements OccupationDao{
	@Autowired
	OccupationRepository OccupationRepository;
	
	OccupationEntity occupationEntity = new OccupationEntity();
	
	public OccupationModel saveOccupation(OccupationModel occupationModel) {
		Optional<OccupationEntity> occupation=OccupationRepository.findById(occupationModel.getOccupationId());
		if(occupation.isEmpty()) {
			occupationEntity.setOccupationId(occupationModel.getOccupationId());
			occupationEntity.setOccupationName(occupationModel.getOccupationName());
			occupationEntity.setSector(occupationModel.getSector());
			OccupationRepository.save(occupationEntity);
			occupationModel.setMsg("Saved Successfully");
			
		}
		else {
			occupationEntity.setOccupationId(occupationModel.getOccupationId());
			occupationEntity.setOccupationName(occupationModel.getOccupationName());
			occupationEntity.setSector(occupationModel.getSector());
			OccupationRepository.save(occupationEntity);
			occupationModel.setMsg("Updated Successfully");
		}
		return occupationModel;
	}

}
