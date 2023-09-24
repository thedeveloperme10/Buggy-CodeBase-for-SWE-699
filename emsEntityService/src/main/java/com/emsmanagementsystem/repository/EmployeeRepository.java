package com.emsmanagementsystem.repository;

import com.emsmanagementsystem.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
