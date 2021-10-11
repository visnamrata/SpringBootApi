package com.restapi.loanapi.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanProducts 
{
	@Id
	private int productId;
	 private String productName;
	 private int principalAmount;
	 private int tenure;
	 private double interestRate;
	 private boolean isActive;
	 private String createdBy;
	 private LocalDateTime createdOn;
	 private String updatedBy;
	 private LocalDateTime updatedOn;
	 

	 
	 public LoanProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanProducts(int productId, String productName, int principalAmount, int tenure, double interestRate,
			boolean isActive, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.principalAmount = principalAmount;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public LoanProducts(String productName, int principalAmount, int tenure, double interestRate, boolean isActive,
			String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
		super();
		this.productName = productName;
		this.principalAmount = principalAmount;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(int principalAmount) {
		this.principalAmount = principalAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "LoanProducts [productId=" + productId + ", productName=" + productName + ", principalAmount="
				+ principalAmount + ", tenure=" + tenure + ", interestRate=" + interestRate + ", isActive=" + isActive
				+ "]";
	}
}
