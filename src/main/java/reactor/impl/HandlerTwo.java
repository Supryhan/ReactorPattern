package main.java.reactor.impl;

import main.java.reactor.Handler;

public class HandlerTwo implements Handler {
    @Override
    public String handle(Class c) {
        return "HandlerTwo";
    }
}
