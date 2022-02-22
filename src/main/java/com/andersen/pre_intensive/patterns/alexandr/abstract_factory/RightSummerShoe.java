package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class RightSummerShoe implements RightShoe {
    private String description;

    public RightSummerShoe() {
        this.description = "";
    }

    @Override
    public void makeShoe() {
        this.description = "right summer shoe";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
