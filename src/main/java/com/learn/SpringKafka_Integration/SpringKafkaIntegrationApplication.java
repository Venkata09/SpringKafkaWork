package com.learn.SpringKafka_Integration;

import com.learn.SpringKafka_Integration.producer.FixedRateProducer;
import com.learn.SpringKafka_Integration.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringKafkaIntegrationApplication implements CommandLineRunner {


    @Autowired
    private KafkaProducer kafkaProducer;

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        kafkaProducer.sendHelloMessages("Venkata ::::::::" + Math.random());
    }




}
