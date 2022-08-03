package com.mindbowser.stripepayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindbowser.stripepayment.entity.PaymentDetail;

@Repository
public interface PaymentDetailRepository extends JpaRepository<PaymentDetail, Long> {

}
