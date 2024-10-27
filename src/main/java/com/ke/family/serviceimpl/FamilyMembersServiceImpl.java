package com.ke.family.serviceimpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ke.family.dao.FamilyMemberDao;
import com.ke.family.entity.FamilyMembersEntity;
import com.ke.family.model.FamilyMemberModel;
import com.ke.family.repository.FamilyMembersRepository;
import com.ke.family.service.FamilyMembersService;

@Service
public class FamilyMembersServiceImpl implements FamilyMembersService{
	
	@Autowired
	FamilyMemberDao familyMemberDoa;
	
	
	public FamilyMemberModel saveMemberDetails(FamilyMemberModel familyMemberModel) throws ParseException {
		
		return familyMemberDoa.saveMemberDetails(familyMemberModel);	
	}
	
	public FamilyMemberModel deleteMemberDetails (String memberID) 
	{		
		return familyMemberDoa.deleteMemberDetails(memberID);
		}
		
	public List<FamilyMembersEntity> searchMemberDetailsByName(String name){
		return familyMemberDoa.searchMemberDetailsByName(name);
	}
	public List<FamilyMembersEntity> getByOccupation(String occupationname){
		return familyMemberDoa.getByOccupation(occupationname);
	}
	
	
}
