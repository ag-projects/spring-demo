package com.agharibi.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	
	@NotNull(message="Account number cannt be empty")
	private Integer accountNo;
	
	@NotNull(message="Account holder name cannot be empty")
	private String accountHolderName;
	
	@NotNull(message="Balance cannot be emtpy")
	private Integer balance;
	
	@NotNull(message="Account type cannot be empty")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/DD/YYYY")
	@NotNull(message="Date of birth cannot be empty")
	private Date dob;
	
	@NotNull(message="Code cannot be empty")
	private String code;
	
	public Account() {

	}
	
	public Account(Integer accountNo, String accountHolderName, Integer balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Account(Integer accountNo, 
			String accountHolderName,
			Integer balance, 
			String accountType,
			Date dob,
			String code) {
		
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.dob = dob;
		this.code = code;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
