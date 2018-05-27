package com.agharibi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.agharibi.model.Account;
import com.agharibi.services.AccountService;


@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("account", new Account());
		return "accountForm";
	}
	
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}

	@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account") Account account, BindingResult result) {	
		if (result.hasErrors()) {
			return "accountForm";
		} else {
			accountService.saveAccount(account);
			return "redirect:/list";
		}
	}
	
	@GetMapping("/list")
	public String listAccounts(Model model) {
		List<Account> accounts = accountService.getAccounts();
		model.addAttribute("accounts", accounts);
		return "accountList";
	}
	
	@GetMapping("/edit")
	public String updateAccount(@RequestParam("accountNo") int accountNo, Model model)  {
		Account account = accountService.getAccount(new Integer(accountNo));
		model.addAttribute("account", account);
		return "accountForm";
	}
}
