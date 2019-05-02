package com.bionische.lms.stock.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="t_monthly_stock_details")
public class MonthlyStockDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockDetailId;
	
	@NotNull
	private int stockHeaderId;
	
	@NotNull
	private int itemId;
	
	@NotNull
	private int opStock;
	
	@NotNull
	private int closingStock;

	public int getStockDetailId() {
		return stockDetailId;
	}

	public void setStockDetailId(int stockDetailId) {
		this.stockDetailId = stockDetailId;
	}

	public int getStockHeaderId() {
		return stockHeaderId;
	}

	public void setStockHeaderId(int stockHeaderId) {
		this.stockHeaderId = stockHeaderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getOpStock() {
		return opStock;
	}

	public void setOpStock(int opStock) {
		this.opStock = opStock;
	}

	public int getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(int closingStock) {
		this.closingStock = closingStock;
	}

	@Override
	public String toString() {
		return "MonthlyStockDetails [stockDetailId=" + stockDetailId + ", stockHeaderId=" + stockHeaderId + ", itemId="
				+ itemId + ", opStock=" + opStock + ", closingStock=" + closingStock + "]";
	}
	
	

}
