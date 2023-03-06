package com.spring.producer.service;


import com.spring.producer.model.UserResponseDto;
import domain.User;
import com.spring.producer.model.UserRequestDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);
}
