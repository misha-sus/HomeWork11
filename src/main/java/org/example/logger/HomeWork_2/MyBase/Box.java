package org.example.logger.HomeWork_2.MyBase;

import org.example.logger.HomeWork_2.BaseStore.StoreBrand;
import org.example.logger.HomeWork_2.MyBase.Food.PlansFoods;

import java.util.List;

public class Box <PlansFoods> {
    public int idStore;
    public StoreBrand storeName;
    public PlansFoods food;

    public Box(int idStore, StoreBrand storeName, PlansFoods food) {
        this.idStore = idStore;
        this.storeName = storeName;
        this.food = food;
    }

    public Box(int id, StoreBrand brand, org.example.logger.HomeWork_2.MyBase.Food.PlansFoods g) {
    }

    public PlansFoods getFood(){
        return food;
    }

}
