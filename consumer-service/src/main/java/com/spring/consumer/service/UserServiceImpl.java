package com.spring.consumer.service;

import com.spring.consumer.repository.UserRepository;
import domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {

        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());

        userRepository.save(newUser);
        log.info(newUser.toString());

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
