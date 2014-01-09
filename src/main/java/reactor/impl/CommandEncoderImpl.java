package main.java.reactor.impl;

import main.java.reactor.CommandEncoder;
import main.java.reactor.domain.A;
import main.java.reactor.domain.B;
import main.java.reactor.domain.C;

public class CommandEncoderImpl implements CommandEncoder {

    @Override
    public Object encode(String s) {

        switch (s) {
            case "A":
                return new A();
            case "B":
                return new B();
            case "C":
                return new C();
            default:
                return null;
        }
    }
}
