package com.m200.accounts.services;

import com.m200.accounts.models.Accounts;
import com.m200.accounts.models.Customer;
import com.m200.accounts.repository.AccountRepo;
import com.m200.accounts.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private AccountRepo accountRepo;


    public Customer saveCustomer(Customer customer) {
       return customerRepo.save(customer);
    }

    public Customer getCustomer(int customerId) {
        return customerRepo.findByCustomerId(customerId);
    }

    public Accounts getCustAccount(int customerId) {
        return accountRepo.findByCustomerId(customerId);
    }
}
