package com.emsmanagementsystem.repository;

import com.emsmanagementsystem.models.Salary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalaryRepository extends MongoRepository<Salary, String> {
}
