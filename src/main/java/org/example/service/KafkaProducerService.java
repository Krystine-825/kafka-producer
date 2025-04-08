package org.example.service;
import org.example.dto.MessageDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, MessageDTO> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, MessageDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageDTO message) {
        kafkaTemplate.send("json-topic", message);
        System.out.println("Sent message: " + message);
    }
}
