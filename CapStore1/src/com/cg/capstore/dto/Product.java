package com.cg.capstore.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private String productId;
	private String productName;
	private String description;
	private float price;
	private String type;
	private String category;
	private int soldQuantities;
	private int views;
	private int stock;
	private int discount;

	public Product() {
	}

	// all
	public Product(String productId, String productName, String description, float price, String type, String category,
			int soldQuantities, int views, int stock, int discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.type = type;
		this.category = category;
		this.soldQuantities = soldQuantities;
		this.views = views;
		this.stock = stock;
		this.discount = discount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSoldQuantities() {
		return soldQuantities;
	}

	public void setSoldQuantities(int soldQuantities) {
		this.soldQuantities = soldQuantities;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", type=" + type + ", category=" + category + ", soldQuantities="
				+ soldQuantities + ", views=" + views + ", stock=" + stock + ", discount=" + discount + "]";
	}
}