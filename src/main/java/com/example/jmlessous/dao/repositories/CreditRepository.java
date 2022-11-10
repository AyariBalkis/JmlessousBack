package com.example.jmlessous.dao.repositories;

import com.example.jmlessous.dao.model.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends CrudRepository<Credit,Long> {
}
