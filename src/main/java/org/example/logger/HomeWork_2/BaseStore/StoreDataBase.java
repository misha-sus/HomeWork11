package org.example.logger.HomeWork_2.BaseStore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.logger.HomeWork_2.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreDataBase {
    public static List<Store> allStores;

    public static void generateStores(){
        Log.LOG.info("Генерируются магазины.");
        allStores = new ArrayList<>();

        Random random = new Random();
        int storesCount = random.nextInt(5)+5;
        for(int i = 0;i < storesCount; i++){
            int storeBrandIndex = random.nextInt(StoreBrand.values().length);
            Log.LOG.debug("Магазин пренадлежит к сети " + StoreBrand.values()[storeBrandIndex]);
            allStores.add(new Store(StoreBrand.values()[storeBrandIndex]));
        }

    }

}
