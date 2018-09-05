package com.PoppyTesting.Testing.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PoppyTesting.Testing.Model.User;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);
}