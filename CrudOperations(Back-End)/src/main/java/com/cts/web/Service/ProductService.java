package com.cts.web.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.web.DTO.ProductDTO;
import com.cts.web.Model.Product;
import com.cts.web.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		repository.findAll().forEach(product1 -> products.add(product1));
		return products;
	}

	public void AddProduct(ProductDTO product) {
		System.out.println(product.toString());
		
		Product productEntity = new Product();
		productEntity.setProductcategory(product.getProductcategory());
		productEntity.setProductdescription(product.getProductdescription());
		productEntity.setProductname(product.getProductname());
		productEntity.setUnit(product.getUnit());
		
		repository.save(productEntity);
	}

	public void DeleteProduct(int id) {
		repository.deleteById(id);
	}

	public void UpdateProduct(Product products, int productid) {
		repository.save(products);
	}

}
