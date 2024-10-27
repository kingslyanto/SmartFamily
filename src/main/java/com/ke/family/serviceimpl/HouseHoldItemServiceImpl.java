package com.ke.family.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ke.family.dao.HouseHoldItemDao;
import com.ke.family.model.HouseHoldItemModel;
import com.ke.family.service.HouseHoldItemService;

@Service
public class HouseHoldItemServiceImpl implements HouseHoldItemService{
@Autowired
HouseHoldItemDao houseHoldItemDao;
	public HouseHoldItemModel saveItem(HouseHoldItemModel houseHoldItemModel ) {
		return houseHoldItemDao.saveItem(houseHoldItemModel);
	}
	
}
