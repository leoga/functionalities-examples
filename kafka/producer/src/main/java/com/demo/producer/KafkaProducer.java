//package com.demo.producer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//
//    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message){
//        RiderLocation riderLocation = new RiderLocation();
//        riderLocation.setRiderId("123");
//        riderLocation.setLatitude(45.56);
//        riderLocation.setLongitude(123.456);
//        kafkaTemplate.send("my-new-topic", riderLocation);
//        return "Message sent: " + riderLocation.getRiderId();
//    }
//}
