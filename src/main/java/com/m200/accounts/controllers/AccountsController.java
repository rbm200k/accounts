package com.m200.accounts.controllers;

import com.m200.accounts.models.Accounts;
import com.m200.accounts.models.CustDetails;
import com.m200.accounts.models.Customer;
import com.m200.accounts.repository.AccountRepo;
import com.m200.accounts.services.AccountsService;
import com.m200.accounts.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RequestMapping("/rbm")
@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private Accounts accounts;

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private CustDetails input;

    @GetMapping("/getAccDetails")
    public Accounts getAccountDetailsController(@RequestBody Customer customer) {
        return accountsService.getAccountDetailsService(customer.getCustomerId());
    }

    @PostMapping("/saveAccount")
    public Accounts saveClient(@RequestBody Customer customer) {
        customer.setCreatedDate(new Date());
        Customer cust = customerService.saveCustomer(customer);
        if (cust != null) {
            accounts.setAccountType("NRI");
            accounts.setBranchAddress("2505 JOhn Eppes Rd,Herndon,VA,20171");
            accounts.setCustomerId(cust.getCustomerId());
            accounts.setCreatedDate(new Date());

            return accountsService.saveAccount(accounts);
        } else {
            return null;
        }

    }

    @GetMapping("/getCustomer")
    public Customer getCustomer(@RequestBody CustDetails cust){
        return customerService.getCustomer(cust.getCustomerId());
    }


}
