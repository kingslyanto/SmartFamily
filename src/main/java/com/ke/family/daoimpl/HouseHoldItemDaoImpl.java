package com.ke.family.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ke.family.dao.HouseHoldItemDao;
import com.ke.family.entity.HouseHoldItemEntity;
import com.ke.family.model.HouseHoldItemModel;
import com.ke.family.repository.HouseHoldItemRepository;

@Repository
public class HouseHoldItemDaoImpl implements HouseHoldItemDao {
	
	@Autowired
	HouseHoldItemRepository houseHoldItemRepository;
	
	public HouseHoldItemModel saveItem(HouseHoldItemModel houseHoldItemModel ) {

		HouseHoldItemEntity houseHoldItemEntity = new HouseHoldItemEntity();
		houseHoldItemEntity.setUniqueId(houseHoldItemModel.getUniqueId());
		houseHoldItemEntity.setCategory(houseHoldItemModel.getCategory());
		houseHoldItemEntity.setConsumableQty(houseHoldItemModel.getConsumableQty());
		houseHoldItemEntity.setCurrentQty(houseHoldItemModel.getCurrentQty());
		houseHoldItemEntity.setFrequency(houseHoldItemModel.getFrequency());
		houseHoldItemEntity.setItemName(houseHoldItemModel.getItemName());
		houseHoldItemEntity.setMinimumQty(houseHoldItemModel.getMinimumQty());
		houseHoldItemRepository.save(houseHoldItemEntity);
		houseHoldItemModel.setStatus("Saved");
		return houseHoldItemModel;
	}
}
