package com.bionische.lms.inventory.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_po_detail")
public class PurchaseHolderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int poDetailId;
	
	@NotNull
	private int poHeaderId;
	
	@NotNull
	private int itemId;
	
	@NotNull
	private int poQty;
	
	@NotNull
	private int receivedQty;

	public int getPoDetailId() {
		return poDetailId;
	}

	public void setPoDetailId(int poDetailId) {
		this.poDetailId = poDetailId;
	}

	public int getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPoQty() {
		return poQty;
	}

	public void setPoQty(int poQty) {
		this.poQty = poQty;
	}

	public int getReceivedQty() {
		return receivedQty;
	}

	public void setReceivedQty(int receivedQty) {
		this.receivedQty = receivedQty;
	}

	@Override
	public String toString() {
		return "PurchaseHolderDetail [poDetailId=" + poDetailId + ", poHeaderId=" + poHeaderId + ", itemId=" + itemId
				+ ", poQty=" + poQty + ", receivedQty=" + receivedQty + "]";
	}
	
	
	


}
