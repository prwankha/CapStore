package com.cg.capstore.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wishlist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wishListItemId;
	@OneToOne
	private Product product;
	@OneToOne
	private User user;

	public Wishlist() {
	}

	// all
	public Wishlist(int wishListItemId, Product product, User user) {
		super();
		this.wishListItemId = wishListItemId;
		this.product = product;
		this.user = user;
	}

	// w/o id
	public Wishlist(Product product, User user) {
		super();
		this.product = product;
		this.user = user;
	}

	public int getWishListItemId() {
		return wishListItemId;
	}

	public void setWishListItemId(int wishListItemId) {
		this.wishListItemId = wishListItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Wishlist [wishListItemId=" + wishListItemId + ", product=" + product + ", user=" + user + "]";
	}
}