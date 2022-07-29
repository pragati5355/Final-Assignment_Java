package com.mindbowser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.entity.Product;
import com.mindbowser.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addNewproduct(Product product) {
		try {
			return productRepository.save(product);
		}
		catch (Exception e) {
			throw (e);
		}

	}

}
