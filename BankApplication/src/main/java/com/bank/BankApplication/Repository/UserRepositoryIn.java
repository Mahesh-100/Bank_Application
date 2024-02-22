package com.bank.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.BankApplication.dto.UserDTO;

public interface UserRepositoryIn extends JpaRepository<UserDTO, Integer>{
	
		UserDTO findByUsername(String username);

}
