package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class SummerShoesFactory implements ShoesFactory {

    @Override
    public RightShoe makeRightShoe() {
        return new RightSummerShoe();
    }

    @Override
    public LeftShoe makeLeftShoe() {
        return new LeftSummerShoe();
    }
}
