package com.s3.simple.ws;

public class GreetingPojo {

    private final long id;
    private final String content;

    public GreetingPojo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content + " Time";
    }
}
