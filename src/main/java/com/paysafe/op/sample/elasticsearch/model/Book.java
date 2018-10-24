package com.paysafe.op.sample.elasticsearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Book {

    private String id;
    private String title;
    private String author;
    private float price;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    //standard setters and getters
}
