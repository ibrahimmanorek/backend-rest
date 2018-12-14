package com.ibrahim.backendrest.pojo;

import java.util.List;

public class OrderPojo {

	private String companyName;
	private String firstName;
	private String lastName;
	private String shippingMethod;
	private String orderDate;
	private String poNumber;
	private String shipDate;
	private String freightCharge;
	private String taxes;
	private String orderSubtotal;
	private List<OrderList> list;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String getFreightCharge() {
		return freightCharge;
	}
	public void setFreightCharge(String freightCharge) {
		this.freightCharge = freightCharge;
	}
	public String getTaxes() {
		return taxes;
	}
	public void setTaxes(String taxes) {
		this.taxes = taxes;
	}
	public String getOrderSubtotal() {
		return orderSubtotal;
	}
	public void setOrderSubtotal(String orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}
	public List<OrderList> getList() {
		return list;
	}
	public void setList(List<OrderList> list) {
		this.list = list;
	}
	
}
