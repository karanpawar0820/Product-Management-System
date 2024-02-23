package com.cts.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.web.DTO.ProductDTO;
import com.cts.web.DTO.UpdateProductDTO;
import com.cts.web.Model.Product;
import com.cts.web.Response.ApiResponse;
import com.cts.web.Service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	@Autowired
	ApiResponse apiResponse;

	@GetMapping("/getAllProducts")
	private ResponseEntity<List<Product>> getAllProducts() {
		return ResponseEntity.ok().body(productservice.getAllProducts());
	}

	@PostMapping("/createProduct")
	public ResponseEntity<ApiResponse> saveProduct(@RequestBody ProductDTO product) {
		productservice.AddProduct(product);
		apiResponse.setMessage(product.getProductname() + " Inserted");
		apiResponse.setStatus(true);
		return ResponseEntity.ok(apiResponse);
	}

	@DeleteMapping("/delete/{productid}")
	public void deleteProduct(@PathVariable("productid") int productid) {
		productservice.DeleteProduct(productid);
	}
	
	@PutMapping("/{productid}")
	public ResponseEntity<ApiResponse> updateProduct(@PathVariable int productid,
			@RequestBody UpdateProductDTO updatedto) {
		Product updatedProduct = productservice.updateProduct(productid, updatedto);
		apiResponse.setMessage(updatedto.getProductname() + " Inserted");
		apiResponse.setStatus(true);
		return ResponseEntity.ok(apiResponse);
	}

}
