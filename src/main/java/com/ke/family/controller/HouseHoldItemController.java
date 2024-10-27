package com.ke.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ke.family.model.HouseHoldItemModel;
import com.ke.family.service.HouseHoldItemService;

@RestController
@RequestMapping("/householditem")
public class HouseHoldItemController {
	@Autowired
	HouseHoldItemService houseHoldItemService;
	@PostMapping("/saveItem")
	public HouseHoldItemModel saveItem(@RequestBody HouseHoldItemModel houseHoldItemModel ) {
		return houseHoldItemService.saveItem(houseHoldItemModel);
	}
}
