package com.company;

public class ThirdSet implements Sets{
    @Override
    public Accessories createAccessory() {
        return new Chocolate();
    }

    @Override
    public Flowers createFlower() {
        return new Tulips();
    }
}
