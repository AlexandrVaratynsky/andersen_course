package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class RightWinterShoe implements RightShoe {
    private String description;

    public RightWinterShoe() {
        this.description = "";
    }

    @Override
    public void makeShoe() {
        this.description = "right winter shoe";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
