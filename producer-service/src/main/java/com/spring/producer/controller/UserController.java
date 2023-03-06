package com.spring.producer.controller;

import com.spring.producer.model.UserResponseDto;
import domain.User;
import com.spring.producer.model.UserRequestDto;
import com.spring.producer.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/versions/1/producer")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public UserResponseDto createUser(@Valid @RequestBody UserRequestDto userRequestDto){
        return userService.createUser(userRequestDto);
    }
}
