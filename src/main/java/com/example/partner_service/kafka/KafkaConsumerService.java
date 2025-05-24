package com.example.partner_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "partner-topic", groupId = "partner_group")
    public void listen(String message) {
        System.out.println("Получено сообщение из Kafka: " + message);
    }
}
