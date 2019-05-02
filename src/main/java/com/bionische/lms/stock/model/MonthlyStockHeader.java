package com.bionische.lms.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_monthly_stock_header")
public class MonthlyStockHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockHeaderId;
	
	@NotNull
	private int month;
	
	@NotNull
	private int year;
	
	@NotNull
	private int isMonthEnd;

	public int getStockHeaderId() {
		return stockHeaderId;
	}

	public void setStockHeaderId(int stockHeaderId) {
		this.stockHeaderId = stockHeaderId;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIsMonthEnd() {
		return isMonthEnd;
	}

	public void setIsMonthEnd(int isMonthEnd) {
		this.isMonthEnd = isMonthEnd;
	}

	@Override
	public String toString() {
		return "MonthlyStockHeader [stockHeaderId=" + stockHeaderId + ", month=" + month + ", year=" + year
				+ ", isMonthEnd=" + isMonthEnd + "]";
	}
	
	

}
