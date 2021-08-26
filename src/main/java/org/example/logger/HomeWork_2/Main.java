package org.example.logger.HomeWork_2;



import org.example.logger.HomeWork_2.BaseStore.StoreDataBase;
import org.example.logger.HomeWork_2.MyBase.WareHouse;


public class Main {
    public static void main(String[] args) {
        StoreDataBase.generateStores();
        WareHouse.initializeStartingSupplies();

    }


}


