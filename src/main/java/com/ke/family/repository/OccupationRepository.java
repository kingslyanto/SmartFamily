package com.ke.family.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ke.family.entity.OccupationEntity;

public interface OccupationRepository extends JpaRepository<OccupationEntity, String>{

}
