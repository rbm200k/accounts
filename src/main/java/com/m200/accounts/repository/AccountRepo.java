package com.m200.accounts.repository;

import com.m200.accounts.models.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepo extends CrudRepository<Accounts,Long> {
    public Accounts findByCustomerId(int CusomterId);

}
