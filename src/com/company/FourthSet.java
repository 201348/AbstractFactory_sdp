package com.company;

public class FourthSet implements Sets{
    @Override
    public Accessories createAccessory() {
        return new Toy();
    }

    @Override
    public Flowers createFlower() {
        return new Peonies();
    }
}
