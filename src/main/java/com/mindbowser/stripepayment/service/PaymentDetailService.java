package com.mindbowser.stripepayment.service;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import com.mindbowser.stripepayment.entity.PaymentDetail;
import com.stripe.model.Event;

public interface PaymentDetailService {

	public String save(PaymentDetail details);

	public ResponseEntity<?> extractEventFromSignature(HttpServletRequest request);

	public String saveSuccessData(Event event);
}
