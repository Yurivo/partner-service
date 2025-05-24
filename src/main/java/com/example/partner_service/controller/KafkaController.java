package com.example.partner_service.controller;

import com.example.partner_service.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendKafkaMessage() {
        kafkaProducerService.sendMessage("Привет, Kafka!");
        return ResponseEntity.ok("Сообщение отправлено!");
    }
}
