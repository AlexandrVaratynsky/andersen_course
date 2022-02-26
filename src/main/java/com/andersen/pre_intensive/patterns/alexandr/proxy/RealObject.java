package com.andersen.pre_intensive.patterns.alexandr.proxy;

public class RealObject implements  Interface{
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("doSomethingElse " + arg);
    }
}
