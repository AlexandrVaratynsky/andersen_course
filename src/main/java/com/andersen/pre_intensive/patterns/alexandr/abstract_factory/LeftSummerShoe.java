package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class LeftSummerShoe implements LeftShoe {
    private String description;

    public LeftSummerShoe() {
        this.description = "";
    }

    @Override
    public void makeShoe() {
        this.description = "left summer shoe";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
