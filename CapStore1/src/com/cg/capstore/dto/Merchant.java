package com.cg.capstore.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String merchantId;
	private String name;
	private String address;
	private String email;
	private String contactNo;
	private String password;
	private String encryptedPassword;

	@ManyToOne
	private Inventory inventory;

	public Merchant() {}

	// all
	public Merchant(String merchantId, String name, String address, String email, String contactNo, String password,
			String encryptedPassword, Inventory inventory) {
		super();
		this.merchantId = merchantId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.inventory = inventory;
	}

	// w/o id
	public Merchant(String name, String address, String email, String contactNo, String password,
			String encryptedPassword, Inventory inventory) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
		this.inventory = inventory;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", contactNo=" + contactNo + ", password=" + password + ", encryptedPassword=" + encryptedPassword
				+ ", inventory=" + inventory + "]";
	}
}