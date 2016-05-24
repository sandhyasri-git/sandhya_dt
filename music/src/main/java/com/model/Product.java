package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String modelId;
	private String description;
	private int prodPrice;
	private int prodQty;
	
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private List<CartItems>cartItems;
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
		public int getProdQty() {
		return prodQty;
	}
		public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	
	public int getProdPrice() {
		return prodPrice;
	}
	
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	

}
