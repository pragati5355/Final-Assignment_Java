package com.mindbowser.stripepayment.service;

import java.util.List;
import com.mindbowser.stripepayment.entity.Product;

public interface ProductService {

	public Product addNewProduct(Product product);

	public List<Product> getAllProduct();

}
