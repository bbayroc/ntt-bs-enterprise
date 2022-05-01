package com.example.enterprise.repository;

import com.example.enterprise.entity.Enterprise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnterpriseRepository extends MongoRepository<Enterprise, Long> {
    Enterprise findByDni(String dni);

}
