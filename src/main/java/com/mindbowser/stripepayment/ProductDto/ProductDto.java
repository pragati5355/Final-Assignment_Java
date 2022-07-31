package com.mindbowser.stripepayment.ProductDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductDto {

	@NotBlank
	private String productName;

	@NotBlank
	private String productDescription;

	@NotNull
	private Double productPrice;

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public Double getProductPrice() {
		return productPrice;
	}

}
