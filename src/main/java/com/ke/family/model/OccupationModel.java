package com.ke.family.model;

import org.springframework.stereotype.Component;

@Component
public class OccupationModel {

	private String occupationId;
	private String occupationName;
	private String sector;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
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
	public OccupationModel(String occupationId, String occupationName, String sector, String msg) {
		super();
		this.occupationId = occupationId;
		this.occupationName = occupationName;
		this.sector = sector;
		this.msg = msg;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public OccupationModel() {
		super();
	}
}
