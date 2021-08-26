package org.example.logger.HomeWork_2.MyBase.Food;

public class Cabbage extends Vegetables{
    public Cabbage(double mass, double price) {
        super(mass, price);
    }

    @Override
    public String toString() {
        return String.format("Капуста вес %.2f , цены %.2f.",mass,price);
    }
}
