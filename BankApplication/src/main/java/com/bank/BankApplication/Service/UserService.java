package com.bank.BankApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankApplication.Repository.UserRepositoryIn;
import com.bank.BankApplication.dto.UserDTO;

@Service
public class UserService {
	private final UserRepositoryIn userRepository;
	

    @Autowired
    public UserService(UserRepositoryIn  userRepository) {
        this.userRepository = userRepository;
		
    }
	public UserDTO createUser(UserDTO user) {
		return userRepository.save(user);

	}
   
	 public UserDTO getUserByUsername(String username) {
		 
		 	
	        return userRepository.findByUsername(username);
	    
	 }
	
		
	
	
}
