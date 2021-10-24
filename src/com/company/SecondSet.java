package com.company;

public class SecondSet implements Sets{
    @Override
    public Accessories createAccessory() {
        return new Chocolate();
    }

    @Override
    public Flowers createFlower() {
        return new Roses();
    }
}
