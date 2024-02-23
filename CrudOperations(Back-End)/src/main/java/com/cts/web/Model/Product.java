package com.cts.web.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
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


}
