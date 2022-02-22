package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class LeftWinterShoe implements LeftShoe {
    private String description;

    public LeftWinterShoe() {
        this.description = "";
    }

    @Override
    public void makeShoe() {
        this.description = "left winter shoe";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
