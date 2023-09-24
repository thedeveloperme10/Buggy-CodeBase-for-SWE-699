package com.emsmanagementsystem.repository;

import com.emsmanagementsystem.models.Insurance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsuranceRepository extends MongoRepository<Insurance, String> {
}
