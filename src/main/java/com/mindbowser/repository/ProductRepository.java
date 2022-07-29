package com.mindbowser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindbowser.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
