package com.bionische.lms.stock.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_stock_transactions")
public class StockTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trId;
	
	@NotNull
	private int itemId;
	
	@NotNull
	private int itemQty;
	
	@NotNull
	private int trMonth;
	
	@NotNull
	private int trYear;
	
	@NotNull
	private Date trDatetime;
	
	@NotNull
	private int trEntryBy;

	public int getTrId() {
		return trId;
	}

	public void setTrId(int trId) {
		this.trId = trId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public int getTrMonth() {
		return trMonth;
	}

	public void setTrMonth(int trMonth) {
		this.trMonth = trMonth;
	}

	public int getTrYear() {
		return trYear;
	}

	public void setTrYear(int trYear) {
		this.trYear = trYear;
	}

	public Date getTrDatetime() {
		return trDatetime;
	}

	public void setTrDatetime(Date trDatetime) {
		this.trDatetime = trDatetime;
	}

	public int getTrEntryBy() {
		return trEntryBy;
	}

	public void setTrEntryBy(int trEntryBy) {
		this.trEntryBy = trEntryBy;
	}

	@Override
	public String toString() {
		return "StockTransaction [trId=" + trId + ", itemId=" + itemId + ", itemQty=" + itemQty + ", trMonth=" + trMonth
				+ ", trYear=" + trYear + ", trDatetime=" + trDatetime + ", trEntryBy=" + trEntryBy + "]";
	}
	


}
