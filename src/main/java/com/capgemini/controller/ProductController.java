package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Product;
import com.capgemini.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/")
	public String Hello() {
		
	return "hello World";
		
	}
	
	@PostMapping(value = "/products")
	public void addProduct(@RequestBody Product product) {
		
		productService.addProduct(product);
		
	}
	
	
	
	

}
