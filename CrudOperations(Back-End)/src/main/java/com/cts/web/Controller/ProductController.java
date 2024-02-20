package com.cts.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.web.DTO.ProductDTO;
import com.cts.web.Model.Product;
import com.cts.web.Service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	@GetMapping("/getAllProducts")
	private List<Product> getAllProducts() {
		System.out.println(productservice.getAllProducts());
		return productservice.getAllProducts();
	}

//	@GetMapping("/{productcategory}")
//	public List<Product> getProductByCategory(@PathVariable String productcategory) {
//		return productservice.findByCategory(productcategory);
//	}

	@PostMapping("/createProduct")
	public String saveProduct(@RequestBody ProductDTO product) {
		System.out.println(product.toString());
		productservice.AddProduct(product);
		return product.getProductname() + " Inserted";
	}

//	@PutMapping("/updateProduct")
//	public String update(@RequestBody Product products) {
//		productservice.AddProduct(products);
//		return products.getProductid()+" Record Updated";
//	}

	@DeleteMapping("/delete/{productid}")
	public void deleteProduct(@PathVariable("productid") int productid) {
		productservice.DeleteProduct(productid);
	}

}
