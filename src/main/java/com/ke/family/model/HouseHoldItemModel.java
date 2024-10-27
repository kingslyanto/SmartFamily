package com.ke.family.model;

import org.springframework.stereotype.Component;

@Component
public class HouseHoldItemModel {

	private	String uniqueId;
	private String itemName;
	private String category;
	private String currentQty;	
	private String minimumQty;
	private String frequency;
	private String consumableQty;
	private String status;
	
	
	public HouseHoldItemModel(String uniqueId, String itemName, String category, String currentQty, String minimumQty,
			String frequency, String consumableQty, String status) {
		super();
		this.uniqueId = uniqueId;
		this.itemName = itemName;
		this.category = category;
		this.currentQty = currentQty;
		this.minimumQty = minimumQty;
		this.frequency = frequency;
		this.consumableQty = consumableQty;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public HouseHoldItemModel() {
		super();
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCurrentQty() {
		return currentQty;
	}
	public void setCurrentQty(String currentQty) {
		this.currentQty = currentQty;
	}
	public String getMinimumQty() {
		return minimumQty;
	}
	public void setMinimumQty(String minimumQty) {
		this.minimumQty = minimumQty;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getConsumableQty() {
		return consumableQty;
	}
	public void setConsumableQty(String consumableQty) {
		this.consumableQty = consumableQty;
	}
}
