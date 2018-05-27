package com.agharibi.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agharibi.entity.AccountEntity;
import com.agharibi.model.Account;

@Repository
public class AccountDaoImp implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveAccount(Account account) {
		
		boolean resultSaved = false;
		
		AccountEntity entity = new AccountEntity();
		entity.setAccountNo(account.getAccountNo());
		entity.setAccountHolderName(account.getAccountHolderName());
		entity.setAccountType(account.getAccountType());
		
		entity.setBalance(account.getBalance());
		entity.setCode(account.getCode());
		entity.setDob(account.getDob());
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(entity);
			resultSaved = true;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());		
		}		
		return resultSaved;
	}

}