package com.cts.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.web.Model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
