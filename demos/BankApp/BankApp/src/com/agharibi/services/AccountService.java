package com.agharibi.services;

import java.util.List;

import com.agharibi.model.Account;

public interface AccountService {
	
	boolean saveAccount(Account account);
	
	List<Account> getAccounts();

	Account getAccount(Integer accountNo);
}
