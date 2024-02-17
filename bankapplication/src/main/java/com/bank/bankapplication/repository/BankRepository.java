package com.bank.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bankapplication.dto.BankAccountDTO;

public interface BankRepository extends JpaRepository<BankAccountDTO, Integer> {

	

	BankAccountDTO createBankAccount(BankAccountDTO account);
	
}
