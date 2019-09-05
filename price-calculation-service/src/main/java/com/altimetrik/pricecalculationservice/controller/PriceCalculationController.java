package com.altimetrik.pricecalculationservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.pricecalculationservice.model.ProductPrice;
import com.altimetrik.pricecalculationservice.proxy.PriceCalculationServiceProxy;

@RestController
public class PriceCalculationController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PriceCalculationServiceProxy proxy;
	
	@GetMapping("/price-calculation-feign/name/{name}/quantity/{quantity}")
	public ProductPrice calculateProductPrice(@PathVariable String name, @PathVariable BigDecimal quantity) {
		ProductPrice response = proxy.getProductDetail(name);
		
		logger.info("{}", response);
		
		return new ProductPrice(response.getId(), name, response.getPrice(), quantity, 
				quantity.multiply(response.getPrice()), response.getPort());
	}
	
	@GetMapping("/info")
	public String getServiceInfo() {
		return "Service name : Price Calculation Service";
	}
	
}
