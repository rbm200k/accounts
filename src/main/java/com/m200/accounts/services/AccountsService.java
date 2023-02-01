package com.m200.accounts.services;

import com.m200.accounts.models.Accounts;
import com.m200.accounts.models.Customer;
import com.m200.accounts.repository.AccountRepo;
import com.m200.accounts.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {
    @Autowired
    private AccountRepo accountRepository;

    public Accounts getAccountDetailsService(int customerId) {
        return accountRepository.findByCustomerId(customerId);
    }

    public Accounts saveAccount(Accounts accounts) {
        return accountRepository.save(accounts);

    }
}
