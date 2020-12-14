package com.ventusairlines.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_account")
public class CustomerAccount {

	@Id
	@Column(name = "customer_id")
	private Long accountId;
	private String username;
	private String password;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Long getAccount_id() {
		return accountId;
	}

	public void setAccount_id(Long account_id) {
		this.accountId = account_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
