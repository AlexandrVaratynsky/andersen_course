package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class ShoesProduction {

    private LeftShoe leftShoe;
    private RightShoe rightShoe;

    public ShoesProduction(ShoesFactory factory) {
        leftShoe = factory.makeLeftShoe();
        rightShoe = factory.makeRightShoe();
    }

    public void makeShoes() {
        leftShoe.makeShoe();
        rightShoe.makeShoe();
    }

    public LeftShoe getLeftShoe() {
        return leftShoe;
    }

    public RightShoe getRightShoe() {
        return rightShoe;
    }

}
