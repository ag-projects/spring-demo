package com.agharibi.daos;

import java.util.List;

import com.agharibi.model.Account;

public interface AccountDao {

	boolean saveAccount(Account account);
	
	List<Account> getAccounts();

	Account getAccount(Integer accountNo);
}
