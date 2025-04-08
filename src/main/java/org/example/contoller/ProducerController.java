package org.example.contoller;
import org.example.dto.MessageDTO;
import org.example.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final KafkaProducerService producerService;

    public ProducerController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody MessageDTO message) {
        producerService.sendMessage(message);
        return "Message sent: " + message;
    }
}
