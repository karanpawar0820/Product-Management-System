package com.cts.web.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
public class Product {
	@Id  
	@Column 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productid;
	@Column
	private String productcategory;
	@Column
	private String productname;
	@Column
	private String productdescription;
	@Column
	private int unit;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

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

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productcategory=" + productcategory + ", productname="
				+ productname + ", productdescription=" + productdescription + ", unit=" + unit + "]";
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

}
