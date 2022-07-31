package com.mindbowser.stripepayment.service;

import java.util.List;
import java.util.Optional;
import com.mindbowser.stripepayment.entity.Product;

public interface ProductService {

	public List<Product> getAllProduct();

	public Optional<Product> findById(Long Id);

}
