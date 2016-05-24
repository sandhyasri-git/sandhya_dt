package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CartInfo implements java.io.Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int cartId;
	
	@OneToMany(mappedBy="CartInfo", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	
	private List<CartItems>cartItems;
	
	@OneToOne
	@JoinColumn(name="name")
	@JsonIgnore
	private Users users;
	
	private double grandTotal;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<CartItems> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	

}
