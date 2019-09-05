package com.altimetrik.productdetailservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.productdetailservice.model.ProductDetail;
import com.altimetrik.productdetailservice.repository.ProductDetailRepository;

@RestController
public class ProductDetailController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ProductDetailRepository repository;
	
	@GetMapping("/product-detail/name/{name}")
	public ProductDetail getProductDetail(@PathVariable String name) {
		ProductDetail productDetail = repository.findByName(name);
		productDetail.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}", productDetail);
		return productDetail;
	}
}
