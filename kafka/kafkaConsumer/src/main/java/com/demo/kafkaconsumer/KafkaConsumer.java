//package com.demo.kafkaconsumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen(String message) {
//        System.out.println("Received Message 1: " + message);
//    }
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen2(String message) {
//        System.out.println("Received Message 2: " + message);
//    }
//
//    @KafkaListener(topics = "my-new-topic", groupId = "my-new-group-rider")
//    public void listenRiderLocation(RiderLocation riderLocation) {
//        System.out.println("Received Location: " + riderLocation.getRiderId()
//                + " : " + riderLocation.getLatitude() + " : " + riderLocation.getLongitude());
//    }
//}
