package com.mindbowser.stripepayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindbowser.stripepayment.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
