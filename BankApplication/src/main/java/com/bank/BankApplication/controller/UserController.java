package com.bank.BankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.BankApplication.Service.BankService;
import com.bank.BankApplication.Service.UserService;
import com.bank.BankApplication.dto.BankAccountDTO;
import com.bank.BankApplication.dto.UserDTO;

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


	@PostMapping("/register")
	public UserDTO createUser(@RequestBody UserDTO user) {

		return userService.createUser(user);

	}
	
	 @PostMapping("/login")
	    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO loginRequest) {
	        // Retrieve user from the database based on username
		 UserDTO user = userService.getUserByUsername(loginRequest.getUsername());

	        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
	            // User found and password matches
	            return ResponseEntity.ok(user);
	        } else {
	            // User not found or password does not match
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	        }
	    }
	 @GetMapping("/login")
	    public ResponseEntity<UserDTO> userDetails(@RequestBody UserDTO loginRequest) {
	        // Retrieve user from the database based on username
		 UserDTO user = userService.getUserByUsername(loginRequest.getUsername());

		 return ResponseEntity.ok(user);
	    }
	
	
	

	
	@PostMapping("/account")
	public BankAccountDTO createBankAccount(@RequestBody BankAccountDTO account) {
		
		return bankService.createBankAccount(account);
	}
	
}
