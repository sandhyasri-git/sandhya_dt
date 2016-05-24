package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Users implements java.io.Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String name;
	private String userEmail;
	private String userPhone;
	private String password;
	
	@OneToOne
	@JoinColumn(name="billingAddressId")
	private BillingAddress billAddress;
	
	@OneToOne
	@JoinColumn(name="shippingAddressId")
	private ShippingAddress shipAddress;
	
	@OneToOne
	@JoinColumn(name="cartId")
	private CartInfo cart;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BillingAddress getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(BillingAddress billAddress) {
		this.billAddress = billAddress;
	}

	public ShippingAddress getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(ShippingAddress shipAddress) {
		this.shipAddress = shipAddress;
	}

	public CartInfo getCart() {
		return cart;
	}

	public void setCart(CartInfo cart) {
		this.cart = cart;
	}
	

}
