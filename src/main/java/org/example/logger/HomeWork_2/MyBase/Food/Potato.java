package org.example.logger.HomeWork_2.MyBase.Food;

public class Potato extends Vegetables{
    public Potato(double mass, double price) {
        super(mass, price);
    }

    @Override
    public String toString() {
        return String.format("Картошка вес %.2f , цены %.2f.",mass,price);
    }
}
