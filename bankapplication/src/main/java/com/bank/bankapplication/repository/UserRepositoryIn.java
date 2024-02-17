package com.bank.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bankapplication.dto.UserDTO;

public interface UserRepositoryIn extends JpaRepository<UserDTO, Integer>{

	UserDTO findByUsernameAndPassword(String username, String password);

	
	

	
	
}
