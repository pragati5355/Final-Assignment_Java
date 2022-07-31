package com.mindbowser.stripepayment.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mindbowser.stripepayment.entity.Product;
import com.mindbowser.stripepayment.enums.ErrorCode;
import com.mindbowser.stripepayment.exception.CustomException;
import com.mindbowser.stripepayment.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		try {
			return productRepository.findAll();
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@Override
	public Optional<Product> findProductById(Long id) {
		try {
			return productRepository.findById(id);
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
}
