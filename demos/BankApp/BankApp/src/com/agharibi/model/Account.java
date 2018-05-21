package com.agharibi.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	
	@NotNull(message="Account number cannt be empty")
	private Integer accountNo;
	
	@NotNull(message="Account holder name cannot be empty")
	@Size(min=2, max=50, message="Invalid text length")
	@Pattern(regexp="[A-Za-z(\\s)]+", message="Invalid text input")
	private String accountHolderName;
	
	@NotNull(message="Balance cannot be emtpy")
	@Min(value=500, message="Account balance cannot be less than $500")
	private Integer balance;
	
	@NotNull(message="Account type cannot be empty")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message="Date of birth cannot be empty")
	@Past(message="Date of birth cannot be in future")
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
