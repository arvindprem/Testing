package com.PoppyTesting.Testing.service.user;

import java.util.Collection;
import java.util.Optional;

import com.PoppyTesting.Testing.Model.User;
import com.PoppyTesting.Testing.Model.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(String id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}