package main.java.reactor.impl;

import main.java.reactor.Handler;

public class HandlerOne implements Handler {
    @Override
    public String handle(Class c) {
        return "HandlerOne";
    }
}
