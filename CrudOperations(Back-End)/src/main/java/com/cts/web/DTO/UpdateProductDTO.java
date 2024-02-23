package com.cts.web.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductDTO {
	private String productcategory;
	private String productname;
	private String productdescription;
	private int unit;
}
