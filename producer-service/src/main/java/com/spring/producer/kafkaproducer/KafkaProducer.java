package com.spring.producer.kafkaproducer;


import domain.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void userProducer(User user) {
        kafkaTemplate.send("user-topic", 0, "key-1", user);
    }





}