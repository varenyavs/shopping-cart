package com.niit.traning.beam;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
	private List myAccounts = new ArrayList();
	
	
	public List getMyAccounts() {
		return myAccounts;
	}
	public void setMyAccounts(List myAccounts) {
		this.myAccounts = myAccounts;
	}
	private String shippingAddress;
	private String permanentAddress;
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	
	}
	
	
}

	
	
	


