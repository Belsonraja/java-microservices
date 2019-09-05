package com.altimetrik.pricecalculationservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.altimetrik.pricecalculationservice.model.ProductPrice;

@FeignClient(name="zuul-gateway-proxy-server")
@RibbonClient(name="product-detail-service")
public interface PriceCalculationServiceProxy {
	@GetMapping("/product-detail-service/product-detail/name/{name}")
	public ProductPrice getProductDetail(@PathVariable("name") String name); 
}
