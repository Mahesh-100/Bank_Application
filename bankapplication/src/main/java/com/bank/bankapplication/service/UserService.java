package com.bank.bankapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dto.UserDTO;
import com.bank.bankapplication.repository.UserRepositoryIn;

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
   
	 public UserDTO getUserByUsernameAndPassword(String username, String password) {
		 
		 	
	        return userRepository.findByUsernameAndPassword(username, password);
	    
	 }
	
		
	
	
}
