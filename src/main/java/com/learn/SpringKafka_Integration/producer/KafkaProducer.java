package com.learn.SpringKafka_Integration.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendHelloMessages(String name) {
        kafkaTemplate.send("t_hello", "Hello" + name);
    }
}
