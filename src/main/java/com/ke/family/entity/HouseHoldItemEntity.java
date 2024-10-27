package com.ke.family.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="householditem")
public class HouseHoldItemEntity {
	@Id
	@Column(name="id")
	private	String uniqueId;
	@Column(name="itemname")
	private String itemName;
	@Column(name="category") 
	private String category;
	@Column(name="currentQty")
	private String currentQty;
	@Column(name="minimumQty")
	private String minimumQty;
	@Column(name="frequency")
	private String frequency;
	@Column(name="consumableQty")
	private String consumableQty;
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
	@Override
	public String toString() {
		return "HouseHoladItem [uniqueId=" + uniqueId + ", itemName=" + itemName + ", category=" + category
				+ ", currentQty=" + currentQty + ", minimumQty=" + minimumQty + ", frequency=" + frequency
				+ ", consumableQty=" + consumableQty + "]";
	}
	public HouseHoldItemEntity(String uniqueId, String itemName, String category, String currentQty, String minimumQty,
			String frequency, String consumableQty) {
		super();
		this.uniqueId = uniqueId;
		this.itemName = itemName;
		this.category = category;
		this.currentQty = currentQty;
		this.minimumQty = minimumQty;
		this.frequency = frequency;
		this.consumableQty = consumableQty;
	}
	public HouseHoldItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
