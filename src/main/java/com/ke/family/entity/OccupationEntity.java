package com.ke.family.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Occupation")
public class OccupationEntity {
	
	@Id
	@Column (name="id")
	private String occupationId;
	@Column(name="occupation_name")
	private String occupationName;
	@Column(name="sector")
	private String sector;
	public String getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
	}
	public String getOccupationName() {
		return occupationName;
	}
	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public OccupationEntity(String occupationId, String occupationName, String sector) {
		super();
		this.occupationId = occupationId;
		this.occupationName = occupationName;
		this.sector = sector;
	}
	public OccupationEntity() {
		super();
	}

}
