package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements java.io.Serializable {
	@Id
	private String modelId;
	private String description;
	private String manuId;
	private int prodQty;
	private double prodPrice;
	  
	
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManuId() {
		return manuId;
	}
	public void setManuId(String manuId) {
		this.manuId = manuId;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}


}
