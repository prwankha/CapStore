package com.cg.capstore.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reviewId;
	private int rating;
	private String review;
	@OneToOne
	private User user;

	@OneToOne
	private Product product;

	public Review() {
	}

	// all
	public Review(int reviewId, int rating, String review, User user, Product product) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.review = review;
		this.user = user;
		this.product = product;
	}

	// w/o id
	public Review(int rating, String review, User user, Product product) {
		super();
		this.rating = rating;
		this.review = review;
		this.user = user;
		this.product = product;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", review=" + review + ", user=" + user
				+ ", product=" + product + "]";
	}
}