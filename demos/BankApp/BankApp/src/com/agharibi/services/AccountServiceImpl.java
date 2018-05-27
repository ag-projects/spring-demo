package com.agharibi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agharibi.daos.AccountDao;
import com.agharibi.model.Account;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		return accountDao.saveAccount(account);
	}

	@Override
	@Transactional
	public List<Account> getAccounts() {
		return accountDao.getAccounts();
	}

	@Override
	@Transactional
	public Account getAccount(Integer accountNo) {
		return accountDao.getAccount(accountNo);
	}
	
	

}
