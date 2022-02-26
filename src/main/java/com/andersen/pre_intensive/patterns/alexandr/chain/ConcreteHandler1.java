package com.andersen.pre_intensive.patterns.alexandr.chain;

public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(int priority) {
        super(priority);
    }

    @Override
    String write(String message) {
        return "Handler 1 <-- " + message;
    }
}
