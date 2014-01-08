package main.java.reactor;
public interface CommandDispatcher {
    Handler dispatch(Object o);
}
