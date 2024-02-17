package com.bank.bankapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapplication.dto.BankAccountDTO;
import com.bank.bankapplication.dto.UserDTO;
import com.bank.bankapplication.service.BankService;
import com.bank.bankapplication.service.UserService;

@RestController
@RequestMapping("/bank")

public class UserController {
	private final UserService userService;
    private final BankService bankService;
	@Autowired
	public UserController(UserService userService, BankService bankService) {
		
		this.userService = userService;
		this.bankService = bankService;
	}


	@PostMapping("/user")
	public UserDTO createUser(@RequestBody UserDTO user) {

		return userService.createUser(user);

	}
	
	@GetMapping
	public UserDTO getUserByUsernameAndPassword(@RequestParam String username,@RequestParam String password) {
		return userService.getUserByUsernameAndPassword(username, password);
		
	}
	
	@PostMapping("/account")
	public BankAccountDTO createBankAccount(@RequestBody BankAccountDTO account) {
		
		return bankService.createBankAccount(account);
	}
	
}
