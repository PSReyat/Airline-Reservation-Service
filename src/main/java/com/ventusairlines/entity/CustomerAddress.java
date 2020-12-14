package com.ventusairlines.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {

	@Id
	@Column(name = "customer_id")
	private Long addressId;
	@Column(name = "door_number")
	private String doorNum;
	private String street;
	private String city;
	private String state;
	private String postcode;
	private String country;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Long getAddress_id() {
		return addressId;
	}

	public void setAddress_id(Long address_id) {
		this.addressId = address_id;
	}

	public String getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(String doorNum) {
		this.doorNum = doorNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
