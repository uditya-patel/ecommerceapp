package com.capgemini.service;

import org.springframework.stereotype.Service;

import com.capgemini.entity.Product;

@Service
public interface ProductService {
	
	public void addProduct(Product product);
	
	

}
