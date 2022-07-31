package com.mindbowser.stripepayment.dao;

import java.util.List;
import java.util.Optional;
import com.mindbowser.stripepayment.entity.Product;

public interface ProductDao {

	public List<Product> findAll();

	public Optional<Product> findProductById(Long id);
}
