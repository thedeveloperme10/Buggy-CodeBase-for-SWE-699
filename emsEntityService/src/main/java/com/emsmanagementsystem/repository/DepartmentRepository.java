package com.emsmanagementsystem.repository;

import com.emsmanagementsystem.models.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {
}
