package com.mindbowser.stripepayment.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PaymentCheckout {

	@NotBlank(message = "Product Name Cannot be Null")
	private String productname;

	@NotNull(message = "Product Id Required")
	private Long productId;

	@NotBlank(message = "Provide Success URL")
	private String successUrl;

	@NotBlank(message = "Provide Cancel URL")
	private String cancelUrl;

	@NotNull(message = "Quantity Required")
	private long productquantity;

	public String getProductname() {
		return productname;
	}

	public Long getProductId() {
		return productId;
	}

	public String getSuccessUrl() {
		return successUrl;
	}

	public String getCancelUrl() {
		return cancelUrl;
	}

	public long getProductquantity() {
		return productquantity;
	}

}
