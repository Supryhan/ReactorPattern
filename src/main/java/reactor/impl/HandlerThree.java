package main.java.reactor.impl;

import main.java.reactor.Handler;

public class HandlerThree implements Handler {
    @Override
    public String handle(Class c) {
        return "HandlerThree";
    }
}
