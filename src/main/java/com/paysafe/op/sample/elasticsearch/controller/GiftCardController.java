package com.paysafe.op.sample.elasticsearch.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.paysafe.op.sample.elasticsearch.model.GiftCard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiftCardController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public GiftCard gift_card(@RequestParam(value="name", defaultValue = "potato") String name){
        GiftCard g = new GiftCard(counter.incrementAndGet(), String.format(template, name));
        return g;
    }
}
