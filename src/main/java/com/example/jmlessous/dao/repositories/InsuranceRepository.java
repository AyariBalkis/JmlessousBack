package com.example.jmlessous.dao.repositories;

import com.example.jmlessous.dao.model.Insurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance,Long> {
}
