package com.bank.BankApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankApplication.Repository.BankRepository;
import com.bank.BankApplication.dto.BankAccountDTO;

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
