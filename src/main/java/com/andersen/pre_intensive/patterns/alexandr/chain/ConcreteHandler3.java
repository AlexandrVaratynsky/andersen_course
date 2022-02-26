package com.andersen.pre_intensive.patterns.alexandr.chain;

public class ConcreteHandler3 extends Handler{
    public ConcreteHandler3(int priority) {
        super(priority);
    }

    @Override
    String write(String message) {
        return "Handler 3 <-- " + message;
    }
}
