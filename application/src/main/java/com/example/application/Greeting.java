package com.example.application;

public class Greeting {

    private final long id;
    private final String content;
    private final String ident;

    public Greeting(long id, String content) {
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
