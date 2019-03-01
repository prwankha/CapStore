package com.cg.capstore.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;
	private String password;
	private String encryptedPassword;
	private String userRole;

	@Embedded
	private Address address;

	@OneToMany
	private Cart cart;

	public User() {
	}

	// w/o id
	public User(String firstName, String lastName, String email, String contactNo, String password,
			String encryptedPassword, String userRole, Address address, Cart cart) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.userRole = userRole;
		this.address = address;
		this.cart = cart;
	}

	//all
	public User(String userId, String firstName, String lastName, String email, String contactNo, String password,
			String encryptedPassword, String userRole, Address address, Cart cart) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.userRole = userRole;
		this.address = address;
		this.cart = cart;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contactNo=" + contactNo + ", password=" + password + ", encryptedPassword=" + encryptedPassword
				+ ", userRole=" + userRole + ", address=" + address + ", cart=" + cart + "]";
	}
}