package org.example.logger.HomeWork_2.MyBase.Food;

public class Apple extends Fruits{
    public Apple(double mass, double price) {
        super(mass, price);
    }

    @Override
    public String toString() {
        return String.format("Яблоки вес %.2f , цены %.2f.",mass,price);
    }
}
