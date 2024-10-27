package com.ke.family.dao;

import java.text.ParseException;
import java.util.List;
import com.ke.family.entity.FamilyMembersEntity;
import com.ke.family.model.FamilyMemberModel;


public interface FamilyMemberDao {
	public FamilyMemberModel saveMemberDetails(FamilyMemberModel familyMemberModel) throws ParseException;
	public FamilyMemberModel deleteMemberDetails (String Id);
	public List<FamilyMembersEntity> searchMemberDetailsByName(String name);
	public List<FamilyMembersEntity> getByOccupation(String occupationname);
	

}
