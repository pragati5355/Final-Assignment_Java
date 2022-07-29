package com.mindbowser.stripepayment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.stripepayment.entity.Product;
import com.mindbowser.stripepayment.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;

	public Product addNewproduct(Product product) {

		return productRepository.save(product);
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public void initproduct() {

		Product product = new Product();
		product.setProductName("New Apple AirPods (3rd Generation)");
		product.setProductDescription("<ul>\n"
				+ "                            <li>Spatial audio with dynamic head tracking places sound all around you</li>\n"
				+ "                            <li>Adaptive EQ automatically tunes music to your ears</li>\n"
				+ "                            <li>All-new contoured design</li>\n"
				+ "                            <li>Force sensor lets you easily control your entertainment, answer or end calls, and more</li>\n"
				+ "                            <li>Sweat and water resistant</li>\n"
				+ "                            <li>Up to 6 hours of listening time with one charge</li>\n"
				+ "                            <li>Up to 30 hours of total listening time with the MagSafe Charging Case</li>\n"
				+ "                            <li>Quick access to Siri by saying “Hey Siri”</li>\n"
				+ "                            <li>Effortless setup, in-ear detection and automatic switching for a magical experience</li>\n"
				+ "                            <li>Easily share audio between two sets of AirPods on your iPhone, iPad, iPod touch or Apple TV</li>\n"
				+ "                        </ul>");
		product.setProductPrice(299.00);
		productRepository.save(product);
	}
}
