package com.paysafe.op.sample.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DummyController {

    @GetMapping("/banana")
    public String banana(){
        return "sdfljsnflkjsn";
    }
}
