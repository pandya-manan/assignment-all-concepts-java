package com.streamapi.practice;

import java.time.LocalDate;

public class Product {
	
	private String name;
	private Double price;
	private Integer id;
	private LocalDate productExpiryDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(LocalDate productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", id=" + id + ", productExpiryDate=" + productExpiryDate
				+ "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, Double price, Integer id, LocalDate productExpiryDate) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.productExpiryDate = productExpiryDate;
	}
	
	

}
