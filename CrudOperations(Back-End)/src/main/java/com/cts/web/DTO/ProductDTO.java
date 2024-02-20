package com.cts.web.DTO;

import jakarta.persistence.Column;

public class ProductDTO {
	private String productcategory;
	private String productname;
	private String productdescription;
	private int unit;
	
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	
	
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "ProductDTO [productcategory=" + productcategory + ", productname=" + productname
				+ ", productdescription=" + productdescription + ", unit=" + unit + "]";
	}

}
