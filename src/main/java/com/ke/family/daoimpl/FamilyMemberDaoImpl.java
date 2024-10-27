package com.ke.family.daoimpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ke.family.dao.FamilyMemberDao;
import com.ke.family.entity.FamilyMembersEntity;
import com.ke.family.entity.OccupationEntity;
import com.ke.family.model.FamilyMemberModel;
import com.ke.family.repository.FamilyMembersRepository;
@Repository
public class FamilyMemberDaoImpl implements FamilyMemberDao{
	@Autowired
	FamilyMembersEntity familyMembersEntity;
	@Autowired
	FamilyMembersRepository familyMembersRepository;

	
	public FamilyMemberModel saveMemberDetails(FamilyMemberModel familyMemberModel) throws ParseException {
		 Optional<FamilyMembersEntity> familyMembers = familyMembersRepository.findById(familyMemberModel.getMemberId());
		 OccupationEntity occObj=new OccupationEntity();
		if(!familyMembers.isPresent()) {
			familyMembersEntity.setmemberId(familyMemberModel.getMemberId());
			familyMembersEntity.setName(familyMemberModel.getName());
			familyMembersEntity.setAge(familyMemberModel.getAge());
			familyMembersEntity.setDob(dateConvetor(familyMemberModel.getDob()));
			familyMembersEntity.setGender(familyMemberModel.getGender());
			familyMembersEntity.setPlace(familyMemberModel.getPlace());
			familyMembersEntity.setMobileNo(familyMemberModel.getMobileNo());
			occObj.setOccupationId(familyMemberModel.getOccupationId()); 
			familyMembersEntity.setOccupation(occObj);
			familyMembersRepository.save(familyMembersEntity);
			familyMemberModel.setMsg("Saved Successfully");
				
		}
		else {
			familyMembersEntity.setmemberId(familyMemberModel.getMemberId());
			familyMembersEntity.setName(familyMemberModel.getName());
			familyMembersEntity.setAge(familyMemberModel.getAge());
			familyMembersEntity.setDob(dateConvetor(familyMemberModel.getDob()));
			familyMembersEntity.setGender(familyMemberModel.getGender());
			familyMembersEntity.setPlace(familyMemberModel.getPlace());
			familyMembersEntity.setMobileNo(familyMemberModel.getMobileNo());
			familyMembersEntity.getOccupation().setOccupationId(familyMemberModel.getOccupationId());
			familyMembersRepository.save(familyMembersEntity);
			familyMemberModel.setMsg("Updated Successfully");
		}
		return familyMemberModel;	
	}
		
	public Date dateConvetor(String str_date) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(str_date);
		return date;
	}	
	
	public FamilyMemberModel deleteMemberDetails (String id)  
	{
		FamilyMemberModel familyMemberModel = new FamilyMemberModel();
		familyMembersRepository.deleteById(id);
		familyMemberModel.setMsg("Deleted successfully");
		return familyMemberModel;
		
	}
	
	public List<FamilyMembersEntity> searchMemberDetailsByName(String name) {
		  return familyMembersRepository.getByName(name);
}
	public List<FamilyMembersEntity> getByOccupation(String occupationname){
		return familyMembersRepository.getByOccupation(occupationname);
	}
	
	 

}
