package org.example.logger.HomeWork_2.MyBase.Food;

public class Banana extends Fruits{
    public Banana(double mass, double price) {
        super(mass, price);
    }

    @Override
    public String toString() {
        return String.format("Банан вес %.2f , цены %.2f.",mass,price);
    }
}
