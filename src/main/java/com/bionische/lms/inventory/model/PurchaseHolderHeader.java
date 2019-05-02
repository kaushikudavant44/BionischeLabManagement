package com.bionische.lms.inventory.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_po_header")
public class PurchaseHolderHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int poHeaderId;
	
	@NotNull
	private int poNo;
	
	@NotNull
	private int vendorId;
	
	@NotNull
	private Date po_date;
	
	@NotNull
	private float poTotal;
	
	@NotNull
	private int poStatus;
	
	@NotNull
	private int poGeneratedBy;
	
	@NotNull
	private int isUsed;

	public int getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public int getPoNo() {
		return poNo;
	}

	public void setPoNo(int poNo) {
		this.poNo = poNo;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public Date getPo_date() {
		return po_date;
	}

	public void setPo_date(Date po_date) {
		this.po_date = po_date;
	}

	public float getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}

	public int getPoStatus() {
		return poStatus;
	}

	public void setPoStatus(int poStatus) {
		this.poStatus = poStatus;
	}

	public int getPoGeneratedBy() {
		return poGeneratedBy;
	}

	public void setPoGeneratedBy(int poGeneratedBy) {
		this.poGeneratedBy = poGeneratedBy;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "PurchaseHolderHeader [poHeaderId=" + poHeaderId + ", poNo=" + poNo + ", vendorId=" + vendorId
				+ ", po_date=" + po_date + ", poTotal=" + poTotal + ", poStatus=" + poStatus + ", poGeneratedBy="
				+ poGeneratedBy + ", isUsed=" + isUsed + "]";
	}
	
	

}
