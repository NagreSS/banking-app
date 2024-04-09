package com.springboot.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
