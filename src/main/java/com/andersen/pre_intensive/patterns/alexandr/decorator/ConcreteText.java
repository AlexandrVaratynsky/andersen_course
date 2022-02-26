package com.andersen.pre_intensive.patterns.alexandr.decorator;

public class ConcreteText implements Text{
    String text;

    public ConcreteText(String text) {
        this.text = text;
    }


    @Override
    public String getSpecialText() {
        return text;
    }
}
