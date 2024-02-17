package com.bank.bankapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dto.BankAccountDTO;
import com.bank.bankapplication.repository.BankRepository;

@Service
public class BankService {
	private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public BankAccountDTO createBankAccount(BankAccountDTO bankAccount) {
        return bankRepository.save(bankAccount);
    }

}
