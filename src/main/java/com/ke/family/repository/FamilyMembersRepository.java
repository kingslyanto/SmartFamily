package com.ke.family.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ke.family.entity.FamilyMembersEntity;


public interface FamilyMembersRepository  extends JpaRepository<FamilyMembersEntity, String>{

	

	List<FamilyMembersEntity> getByName(String name);
	
	@Query(value = "select fm.*,c.* from familymembers fm left join Occupation c on fm.occupation_id=c.id where c.occupation_name=:occname",nativeQuery = true)
	public List<FamilyMembersEntity> getByOccupation(@Param ("occname") String occupationname);
	

}
