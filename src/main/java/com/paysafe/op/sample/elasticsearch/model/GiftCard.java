package com.paysafe.op.sample.elasticsearch.model;

public class GiftCard {
    private final long id;
    private final String content;

    public GiftCard(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
