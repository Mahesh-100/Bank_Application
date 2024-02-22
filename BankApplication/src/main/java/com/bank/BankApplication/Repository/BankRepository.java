package com.bank.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.BankApplication.dto.BankAccountDTO;

public interface BankRepository extends  JpaRepository<BankAccountDTO, Integer>{

}
