package com.ke.family.model;

import java.util.Date;



public class FamilyMemberModel {
	private String memberId;
	private String name;
	private int age;
	private String dob;
	private String place;
	private String gender;
	private String mobileNo;
	private String msg;
	private String occupationId;
	private String occupationName;
	private String sector;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public void setSector(String sector) {
		this.sector = sector;
	}
	public FamilyMemberModel(String memberId, String name, int age, String dob, String place, String gender,
			String mobileNo, String msg, String occupationId, String occupationName, String sector) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.place = place;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.msg = msg;
		this.occupationId = occupationId;
		this.occupationName = occupationName;
		this.sector = sector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public FamilyMemberModel() {
		super();
	}
}
