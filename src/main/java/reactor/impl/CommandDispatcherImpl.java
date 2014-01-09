package main.java.reactor.impl;

import main.java.reactor.CommandDispatcher;
import main.java.reactor.Handler;

import java.util.Map;

public class CommandDispatcherImpl implements CommandDispatcher {

    Map<Class, Handler> classHandlerMap;

    public CommandDispatcherImpl(Map<Class, Handler> classHandlerMap) {
        this.classHandlerMap = classHandlerMap;
    }

    @Override
    public Handler dispatch(Object o) {
        return classHandlerMap.get(o.getClass());
    }
}
