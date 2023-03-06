package com.spring.consumer.kafkaconsumer;
import com.spring.consumer.service.UserService;
import domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserConsumer {
    private final UserService userService;

    public UserConsumer(UserService userService) {
        this.userService = userService;
    }

    @KafkaListener(groupId = "kafka-group-id",
            topicPartitions = {@TopicPartition(topic = "user-topic",
                    partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0", relativeToCurrent = "true"))}
    )
    public void userConsumer(User user) {

            userService.createUser(user);


    }

}
