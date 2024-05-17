package org.matadini;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
class ProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/send")
    public void sendNotification() {
        ProducerRecord<String, String> record = new ProducerRecord<>(
                "kafka-demo-app-topic",
                UUID.randomUUID().toString(), "my message from spring boot app!");
        kafkaTemplate.send(record);
    }
}
