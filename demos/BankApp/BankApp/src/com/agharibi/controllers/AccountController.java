package com.agharibi.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.agharibi.model.Account;


@Controller
public class AccountController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("account", new Account());
		return "newAccount";
	}
	
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}

	@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model, 
			@RequestParam("accountNo") String accountNo,
			@RequestParam("accountHolderName") String accountHolderName,
			@RequestParam("balance") String balance) {


		
		/**
		 * Using Account object itself
		 */
		Account account = new Account();
		account.setAccountNo(Integer.valueOf(accountNo));
		account.setAccountHolderName(accountHolderName);
		account.setBalance(Integer.valueOf(balance));
		model.addAttribute("account", account);
		
		return "showAccount";
	}
}
