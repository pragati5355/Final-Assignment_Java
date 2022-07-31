package com.mindbowser.stripepayment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.mindbowser.stripepayment.entity.Product;
import com.mindbowser.stripepayment.model.PaymentCheckout;
import com.mindbowser.stripepayment.service.ProductService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"api/v1/product"})
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping({"/get-product"})
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	private static void init() {
		Stripe.apiKey = "sk_test_51LPhdYSBmyKzkfqIXTFif7cw8GkntVrdlk1M70TQhovqDD2KlJCpEktIb0HwcTE2QxAA12csJOmwlkrjJxCG4sfv005VYipltr";
	}

	private static Gson gson = new Gson();

	@PostMapping("/payments")
	public String paymentWithCheckoutPage(@Valid @RequestBody PaymentCheckout payment) throws StripeException {

		init();

		Product product = productService.findById(payment.getProductId()).get();
		Long productPrice = product.getProductPrice();

		SessionCreateParams params = SessionCreateParams.builder()
				.addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
				.setMode(SessionCreateParams.Mode.PAYMENT)
				.setSuccessUrl(payment.getSuccessUrl())
				.setCancelUrl(payment.getCancelUrl())
				.addLineItem(
						SessionCreateParams.LineItem.builder().setQuantity(payment.getProductquantity())
								.setPriceData(
										SessionCreateParams.LineItem.PriceData.builder()
												.setCurrency("usd")
												.setUnitAmount(productPrice * 100)
												.setProductData(SessionCreateParams.LineItem.PriceData.ProductData
														.builder()
														.setName(payment.getProductname()).build())
												.build())
								.build())
				.build();

		Session session = Session.create(params);

		Map<String, String> responseData = new HashMap<String, String>();

		responseData.put("id", session.getId());
		System.out.println(responseData.toString());
		return gson.toJson(responseData);

	}

}
