package com.mu.microservices.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {

	private static final long serialVersionUID = -2403625808012978175L;

	private Long id;
	private String owner;
	private Integer type;
	private BigDecimal balance;

	public Account(Long id, String owner, Integer type, BigDecimal balance) {
		this.id = id;
		this.owner = owner;
		this.type = type;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", owner=" + owner + ", type=" + type + ", balance=" + balance
				+ "]";
	}

}
