package com.andersen.pre_intensive.patterns.alexandr.decorator;

import java.util.Date;

public class RightDecoratedText implements Text{
    Text text;

    public RightDecoratedText(Text text) {
        this.text = text;
    }

    @Override
    public String getSpecialText() {
        return text.getSpecialText()
                + System.getProperty("line.separator")
                + "* * * ";
    }
}
