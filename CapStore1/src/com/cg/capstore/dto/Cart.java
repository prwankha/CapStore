package com.cg.capstore.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartItemId;
	private float itemPrice;
	private int quantity;
	@OneToOne 
	private Product product;

	@ManyToOne
	private User user;

	public Cart() {
	}

	public Cart(float itemPrice, int quantity, Product product, User user) {
		super();
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.product = product;
		this.user = user;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemIdId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Cart [cartItemId=" + cartItemId + ", itemPrice=" + itemPrice + ", quantity=" + quantity + ", product=" + product
				+ ", user=" + user+ "]";
	}
}