package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Orders implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int  orderId;
	
	@OneToOne
	@JoinColumn(name="cartId")
	 private CartInfo cartInfo;
	 @OneToOne
	 @JoinColumn(name="name")
	 private Users users;
	 
	 @OneToOne
	 @JoinColumn(name="billingAddressId")
	 private BillingAddress billingAddress;
	 
	 @OneToOne
	 @JoinColumn(name="shippingAddressId")
	 private ShippingAddress shippingAddress;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public CartInfo getCartInfo() {
		return cartInfo;
	}

	public void setCartInfo(CartInfo cartInfo) {
		this.cartInfo = cartInfo;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
