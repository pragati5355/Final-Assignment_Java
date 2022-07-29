package com.mindbowser.stripepayment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindbowser.stripepayment.entity.Product;
import com.mindbowser.stripepayment.service.ProductServiceImpl;

@RestController
@RequestMapping({"api/v1/product"})
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	// @PostConstruct
	// public void initproduct() {
	// productServiceImpl.initproduct();
	// }

	@PostMapping()
	public Product addNewProduct(@RequestBody Product product) {
		return productServiceImpl.addNewproduct(product);
	}

	@GetMapping({"/get-product"})
	public List<Product> getAllProduct() {
		return productServiceImpl.getAllProduct();
	}

}
