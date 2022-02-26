package com.andersen.pre_intensive.patterns.alexandr.chain;

public class Chain {
    Handler handler1;
    Handler handler2;
    Handler handler3;

    public Chain(int priority1, int priority2, int priority3) {
        this.handler1 = new ConcreteHandler1(priority1);
        this.handler2 = new ConcreteHandler2(priority2);
        this.handler3 = new ConcreteHandler3(priority3);
        handler1.setNext(handler2);
        handler2.setNext(handler3);


    }

}
