package com.learn.SpringKafka_Integration.producer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {

    @Autowired
    private KafkaTemplate<String, String> fixedRateKafkaTemplate;

    private int incrementVar = 0;
    private Logger logger = LoggerFactory.getLogger(FixedRateProducer.class);

    @Scheduled(fixedRate = 1000)
    public void sendTheRatesDataToKafka(String rate) {
        incrementVar++;
        fixedRateKafkaTemplate.send("t_fixedrate", "Fixed-Rate::::::" + incrementVar);
        logger.info("Incremental Variable is :::::::::::> " + incrementVar);
    }


}
