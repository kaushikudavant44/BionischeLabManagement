package com.bionische.lms.demo.model;

import javax.persistence.Entity;
import javax.validation.constraints.*;

import javax.persistence.*;

@Entity
@Table(name = "m_items")
public class Item {

	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @NotNull
    private int labId;

    @NotNull
    private int branchId;
    
    @NotBlank
    private  String itemName;
     
    @NotNull
    private int isUsed;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", labId=" + labId + ", branchId=" + branchId + ", itemName=" + itemName
				+ ", isUsed=" + isUsed + "]";
	}

	
    
	
}
