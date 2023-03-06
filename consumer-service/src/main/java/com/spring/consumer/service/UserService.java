package com.spring.consumer.service;


import domain.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    List<User> getAllUsers();
}
