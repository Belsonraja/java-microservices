package com.altimetrik.pricecalculationservice.model;

import java.math.BigDecimal;

public class ProductPrice {
	private Long id;
	private String name;
	private BigDecimal price;
	private BigDecimal quantity;
	private BigDecimal totalPrice;
	private int port;
	
	public ProductPrice() {
		
	}
	
	public ProductPrice(Long id, String name, BigDecimal price, BigDecimal quantity, BigDecimal totalPrice, int port) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.port = port;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
