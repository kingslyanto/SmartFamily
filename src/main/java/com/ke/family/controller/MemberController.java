package com.ke.family.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ke.family.entity.FamilyMembersEntity;
import com.ke.family.model.BooksModel;
import com.ke.family.model.FamilyMemberModel;
import com.ke.family.service.APIService;
import com.ke.family.service.FamilyMembersService;
import com.ke.family.serviceimpl.APIServiceImpl;

@RestController
@RequestMapping("/family")
public class MemberController {
	
	@Autowired
	FamilyMembersService familyMembersService;
	@Autowired
	APIService apiService;
	
	@PostMapping("/saveMemberDetails")
	public FamilyMemberModel saveMemberDetails(@RequestBody FamilyMemberModel familyMemberModel) throws ParseException {
		return familyMembersService.saveMemberDetails(familyMemberModel);
	}

	@GetMapping("/deleteMemberDetails")
	public FamilyMemberModel deleteMemberDetails(@RequestParam (value = "memberId") String memberId) {
		return familyMembersService.deleteMemberDetails(memberId);
	}
	@GetMapping("/serchbyName")
	public List<FamilyMembersEntity> searchMemberDetailsByName(@RequestParam(value="memberName") String name){
		return familyMembersService.searchMemberDetailsByName(name);
	}
	@GetMapping("/getByOccupationName")
	public List<FamilyMembersEntity> getByOccupation(@RequestParam (value="occupationNmae") String occupationname){
		return familyMembersService.getByOccupation(occupationname);
	}
	@GetMapping("/getBooks")
	public String getBooks() {
		return apiService.get();
	}
	@GetMapping("/getBookDetails")
	public BooksModel bookDetails (@RequestParam (value="bookID") int id) {
		return apiService.bookDetails(id);
	}
	
}
