package com.m200.accounts;

import com.m200.accounts.models.Accounts;
import com.m200.accounts.models.CustDetails;
import com.m200.accounts.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountsApplication {
    @Autowired
	private AccountRepo accountRepo;

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

	@Bean(name = "accounts")
	public Accounts getAccounts(){
		return new Accounts();
	}

	@Bean(name="input")
	public CustDetails getCustDetails(){
		return new CustDetails();
	}



}
