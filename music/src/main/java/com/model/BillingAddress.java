package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress implements java.io.Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int billingAddressId;
	
	private String houseNumber;
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	private String zipCode;	
	@OneToOne
	private Users users;
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	public int getBillingAddressId() {
		return billingAddressId;
	}
	public void setShipAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	

	@Override
	
	public String toString()
	{
		return "Billing Address Id "+billingAddressId+", houseNumber="+houseNumber+" , addressLine1="+addressLine1+" ,city="+city+" , state="+state+", country="+country+", state="+state+", zipCode="+zipCode;
	}

}
