package com.kafkaesque.kafkaesque.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkaesque.kafkaesque.entity.User;

@Service
public class JsonKafkaConsumer {

    @Value("${spring.kafka.topic.nameJson}")
    private String topicNameJson;

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.nameJson}", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }

}
