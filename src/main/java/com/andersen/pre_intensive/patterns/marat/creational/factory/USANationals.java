package com.andersen.pre_intensive.patterns.marat.creational.factory;

public class USANationals implements Event{
    @Override
    public Rules getRules() {
        return new USARules();
    }
}
