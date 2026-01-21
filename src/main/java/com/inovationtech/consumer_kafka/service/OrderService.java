package com.inovationtech.consumer_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import com.inovationtech.consumer_kafka.record.OrderRecord;

@Service
public class OrderService {
  @KafkaListener(topicPartitions = @TopicPartition(topic = "order-processed", partitions = { "0" }), containerFactory = "orderKafkaListenerContainerFactory")
  public void orderListener(OrderRecord order) {
    System.out.println("Received message consumer 01: " + order.name());
  }
}
