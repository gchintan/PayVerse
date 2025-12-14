package com.payverse.user_service.service;
import com.payverse.user_service.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    Optional<User> getUserById(Long Id);
    List<User> getAllUsers();
}
