package com.bionische.lms.subscription.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_subscription_package")
public class SubscriptionPackage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subsPkgId;
	
	@NotNull
	private String subsPkgName;
	
	@NotNull
	private float subsPkgAmount;
	
	@NotNull
	private int subsPkgDuration;
	
	@NotNull
	private int durationType;
	
	@NotNull
	private int isUsed;

	public int getSubsPkgId() {
		return subsPkgId;
	}

	public void setSubsPkgId(int subsPkgId) {
		this.subsPkgId = subsPkgId;
	}

	public String getSubsPkgName() {
		return subsPkgName;
	}

	public void setSubsPkgName(String subsPkgName) {
		this.subsPkgName = subsPkgName;
	}

	public float getSubsPkgAmount() {
		return subsPkgAmount;
	}

	public void setSubsPkgAmount(float subsPkgAmount) {
		this.subsPkgAmount = subsPkgAmount;
	}

	public int getSubsPkgDuration() {
		return subsPkgDuration;
	}

	public void setSubsPkgDuration(int subsPkgDuration) {
		this.subsPkgDuration = subsPkgDuration;
	}

	public int getDurationType() {
		return durationType;
	}

	public void setDurationType(int durationType) {
		this.durationType = durationType;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "SubscriptionPackage [subsPkgId=" + subsPkgId + ", subsPkgName=" + subsPkgName + ", subsPkgAmount="
				+ subsPkgAmount + ", subsPkgDuration=" + subsPkgDuration + ", durationType=" + durationType
				+ ", isUsed=" + isUsed + "]";
	}

	
}
