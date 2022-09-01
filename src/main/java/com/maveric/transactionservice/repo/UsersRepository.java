package com.maveric.transactionservice.repo;

import com.maveric.transactionservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, Integer> {
}
