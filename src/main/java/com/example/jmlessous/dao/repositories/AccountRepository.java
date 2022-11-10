package com.example.jmlessous.dao.repositories;

import com.example.jmlessous.dao.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
}
