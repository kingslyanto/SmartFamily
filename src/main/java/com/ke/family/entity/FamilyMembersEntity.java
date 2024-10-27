package com.ke.family.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name="familymembers")

@AllArgsConstructor
@NoArgsConstructor
@Component
public class FamilyMembersEntity {
	
	@Id
	@Column(name="memberid")
	private String memberId;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="dob")
	private Date dob;
	@Column(name="place")
	private String place;
	@Column(name="gender")
	private String gender;
	@Column(name="mobileno")
	private String mobileNo;
	@ManyToOne
	@JoinColumn(name="occupation_id")
	private OccupationEntity occupation;
	
	public String getImemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	public OccupationEntity getOccupation() {
		return occupation;
	}
	public void setOccupation(OccupationEntity occupation) {
		this.occupation = occupation;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	
	
}
