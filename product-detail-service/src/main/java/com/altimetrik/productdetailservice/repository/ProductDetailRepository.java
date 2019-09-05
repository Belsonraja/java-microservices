package com.altimetrik.productdetailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.productdetailservice.model.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
	ProductDetail findByName(String name);
}
