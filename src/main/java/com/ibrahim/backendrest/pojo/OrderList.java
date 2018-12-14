package com.ibrahim.backendrest.pojo;

public class OrderList {
	
	private String product;
	private String quantity;
	private String unitPrice;
	private String Discount;
	private String ExtendedPrice;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getExtendedPrice() {
		return ExtendedPrice;
	}
	public void setExtendedPrice(String extendedPrice) {
		ExtendedPrice = extendedPrice;
	}
	

}
