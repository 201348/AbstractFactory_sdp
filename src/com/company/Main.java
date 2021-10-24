package com.company;

public class Main {

    public static void main(String[] args) {
	Sets factory = new FirstSet();
    Flowers flowers = factory.createFlower();
    flowers.collectBouquet();

    factory = new SecondSet();
    flowers = factory.createFlower();
    flowers.collectBouquet();
    }


}
