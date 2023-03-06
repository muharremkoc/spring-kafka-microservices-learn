package com.spring.producer.service;

import com.spring.producer.kafkaproducer.KafkaProducer;
import com.spring.producer.model.UserResponseDto;
import domain.User;
import com.spring.producer.model.UserRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService{


    private final KafkaProducer kafkaProducer;

    public UserServiceImpl(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto){
        UserResponseDto userResponseDto =new UserResponseDto();
        userResponseDto.setUsername(userRequestDto.getUsername());
        userResponseDto.setEmail(userRequestDto.getEmail());
        userResponseDto.setPassword(userRequestDto.getPassword());

        User newUser = new User();
        newUser.setUsername(userRequestDto.getUsername());
        newUser.setPassword(userRequestDto.getPassword());
        newUser.setEmail(userRequestDto.getEmail());
        kafkaProducer.userProducer(newUser);
        log.info("User sınıfı kuyruğa gönderildi : " + newUser.toString());


        return userResponseDto;
    }
}
