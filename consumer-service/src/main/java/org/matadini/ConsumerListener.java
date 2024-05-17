package org.matadini;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class ConsumerListener {
    @KafkaListener(topics = "kafka-demo-app-topic", groupId = "kafka-demo-app-consumer-group")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
