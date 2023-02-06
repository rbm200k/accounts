package com.m200.accounts.repository;

import com.m200.accounts.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(int customerId);
}
