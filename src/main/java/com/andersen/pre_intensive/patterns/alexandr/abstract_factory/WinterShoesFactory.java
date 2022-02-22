package com.andersen.pre_intensive.patterns.alexandr.abstract_factory;

public class WinterShoesFactory implements ShoesFactory {

    @Override
    public RightShoe makeRightShoe() {
        return new RightWinterShoe();
    }

    @Override
    public LeftShoe makeLeftShoe() {
        return new LeftWinterShoe();
    }
}
