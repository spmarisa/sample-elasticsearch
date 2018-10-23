package com.paysafe.op.sample.elasticsearch.controller;

import java.net.URI;
import java.util.concurrent.atomic.AtomicLong;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.paysafe.op.sample.elasticsearch.model.GiftCard;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Component
@EnableCircuitBreaker
public class GiftCardController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public GiftCard gift_card(@RequestParam(value="name", defaultValue = "potato") String name){
        GiftCard g = new GiftCard(counter.incrementAndGet(), String.format(template, name));
        return g;
    }

    @GetMapping("/dummy")
    @HystrixCommand(fallbackMethod = "reliable")
    public String dummy(){
        //        String tmp_string = "dummy from sample es";
//        return tmp_string;

        RestTemplate restTemplate = new RestTemplate();
        URI uri = URI.create("http://localhost:8021/v1/dummy");

        return restTemplate.getForObject(uri, String.class);
    }

    private String reliable() {
        return "circuit breaker";
    }

}
