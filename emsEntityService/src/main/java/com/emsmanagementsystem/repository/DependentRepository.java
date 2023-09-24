package com.emsmanagementsystem.repository;

import com.emsmanagementsystem.models.Dependent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DependentRepository extends MongoRepository<Dependent, String> {
}
