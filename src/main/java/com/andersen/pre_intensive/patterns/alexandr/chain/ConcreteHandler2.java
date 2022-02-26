package com.andersen.pre_intensive.patterns.alexandr.chain;

public class ConcreteHandler2 extends Handler{
    public ConcreteHandler2(int priority) {
        super(priority);
    }

    @Override
    String write(String message) {
        return "Handler 2 <-- " + message;
    }

}
