package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItems implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int cartItemId;
	@ManyToOne
	@JoinColumn(name="cartId")
	@JsonIgnore
	private CartInfo cart;
	
	@ManyToOne
	@JoinColumn(name="modelId")
	@JsonIgnore
	private Product product;
	
	private int qty;
	private double totalPrice;
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public CartInfo getCart() {
		return cart;
	}
	public void setCart(CartInfo cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
