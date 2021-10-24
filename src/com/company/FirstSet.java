package com.company;

public class FirstSet implements Sets{
    @Override
    public Accessories createAccessory() {
        return new Toy();
    }

    @Override
    public Flowers createFlower() {
        return new Gypsophila();
    }
}
