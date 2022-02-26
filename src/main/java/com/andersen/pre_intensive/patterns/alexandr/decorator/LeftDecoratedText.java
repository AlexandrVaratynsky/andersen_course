package com.andersen.pre_intensive.patterns.alexandr.decorator;

public class LeftDecoratedText implements  Text {
    Text text;


    public LeftDecoratedText(Text text) {
        this.text = text;
    }

    @Override
    public String getSpecialText() {
        return "Decorate text: "+text.getSpecialText();
    }
}
