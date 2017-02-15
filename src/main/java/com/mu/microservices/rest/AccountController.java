package com.mu.microservices.rest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mu.microservices.model.Account;

@RestController
public class AccountController {

	@RequestMapping(value = "/accounts/{id}", produces = "application/json")
	public Account getAccountById(@PathVariable Long id) {
		return getAccount(id);
	}

	@RequestMapping(value = "/accounts/owner/{ownerName}", produces = "application/json")
	public List<Account> getOwnerAccounts(@PathVariable String ownerName) {
		return getAccounts(ownerName);
	}

	private List<Account> getAccounts(String ownerName) {
		return Arrays.asList(new Account(1l, "John", 1, BigDecimal.valueOf(25000.0)), new Account(
				2l, "John", 2, BigDecimal.valueOf(50000.0)),
				new Account(3l, "John", 1, BigDecimal.valueOf(15000.0)), new Account(4l, "John", 2,
						BigDecimal.valueOf(100000.0)),
				new Account(5l, "John", 1, BigDecimal.valueOf(20000.0)));
	}

	private Account getAccount(Long id) {
		return new Account(id, "John", 1, BigDecimal.valueOf(25000.0));
	}

}
