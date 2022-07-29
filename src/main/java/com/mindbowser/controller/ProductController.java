package com.mindbowser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindbowser.entity.Product;
import com.mindbowser.service.ProductServiceImpl;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@PostMapping({"/add-product"})
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewproduct(product);

	}
}
