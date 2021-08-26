package org.example.logger.HomeWork_2.MyBase.Food;

public abstract class PlansFoods {
    public double mass;
    public double price;

    public PlansFoods(double mass, double price) {
        this.mass = mass;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PlansFoods{" +
                "mass=" + mass +
                ", price=" + price +
                '}';
    }
}
