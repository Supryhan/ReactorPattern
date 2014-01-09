package main.java.reactor;

import main.java.reactor.domain.A;
import main.java.reactor.domain.B;
import main.java.reactor.domain.C;
import main.java.reactor.impl.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    CommandEncoder commandEncoder;
    CommandDispatcher commandDispatcher;
    Handler handler;

    public Main() {
        commandEncoder = new CommandEncoderImpl();
        Map<Class, Handler> classHandlerMap = new HashMap<>();
        classHandlerMap.put(A.class, new HandlerOne());
        classHandlerMap.put(B.class, new HandlerTwo());
        classHandlerMap.put(C.class, new HandlerThree());
        commandDispatcher = new CommandDispatcherImpl(classHandlerMap);
        handler = commandDispatcher.dispatch(new A());
    }

    public static void main(String[] args) {
        System.out.println(new Main().handler.handle(A.class));
    }
}
