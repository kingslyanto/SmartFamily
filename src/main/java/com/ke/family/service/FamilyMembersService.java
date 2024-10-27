package com.ke.family.service;

import java.text.ParseException;
import java.util.List;

import com.ke.family.entity.FamilyMembersEntity;
import com.ke.family.model.FamilyMemberModel;

public interface FamilyMembersService {
	public FamilyMemberModel saveMemberDetails(FamilyMemberModel familyMemberModel) throws ParseException ;
	public FamilyMemberModel deleteMemberDetails (String memberId);
	public List<FamilyMembersEntity> searchMemberDetailsByName(String name);
	public List<FamilyMembersEntity> getByOccupation(String occupationname);
}
