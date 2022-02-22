package com.andersen.pre_intensive.patterns.marat.creational.factory;

public class RussiaNationals implements Event{
    @Override
    public Rules getRules() {
        return new RussiaRules();
    }
}
