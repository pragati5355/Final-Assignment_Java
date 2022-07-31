package com.mindbowser.stripepayment.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.stripepayment.dao.ProductDao;
import com.mindbowser.stripepayment.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProduct() {
		return productDao.findAll();
	}

	@Override
	public Optional<Product> findById(Long Id) {
		return productDao.findProductById(Id);
	}

}
