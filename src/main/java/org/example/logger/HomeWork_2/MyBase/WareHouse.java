package org.example.logger.HomeWork_2.MyBase;



import org.example.logger.HomeWork_2.BaseStore.Store;
import org.example.logger.HomeWork_2.BaseStore.StoreDataBase;
import org.example.logger.HomeWork_2.Log;
import org.example.logger.HomeWork_2.MyBase.Food.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WareHouse {
    List<Box<PlansFoods>>baseStorage;


    public static void initializeStartingSupplies(){
        Log.LOG.debug("Работает метод инициализации");
        generatePlansFood().stream().map((g) -> {
            Random random = new Random();
            Store randomStore = StoreDataBase.allStores.get(random.nextInt(StoreDataBase.allStores.size()));
            return new Box(randomStore.id, randomStore.brand,g);

        });
    }


    public static List<PlansFoods> generatePlansFood(){
        List<PlansFoods> generatedFood = new ArrayList<>();
        Random random = new Random();
        int greenFoodsCount = random.nextInt(30)+10;
        Log.LOG.info(String.format("Будет сгенерированно %d партий продуктов",greenFoodsCount));
        for(int i = 0;i<greenFoodsCount;i++){
            int greenFoodChoice = random.nextInt(4);
            double price = random.nextDouble()*30+10;
            double mass = random.nextDouble()*5 +20;

            PlansFoods plansFood;

            switch (greenFoodChoice){
                case 0:
                    plansFood = new Apple(price,mass);
                    Log.LOG.debug("Сгенерировал коробку с яблоками");
                    break;
                case 1:
                    plansFood = new Banana(price,mass);
                    Log.LOG.debug("Сгенерировал коробку с бананами");
                    break;
                case 2:
                    plansFood = new Potato(price,mass);
                    Log.LOG.debug("Сгенерировал коробку с картошкой");
                    break;
                case 3:
                default:
                    plansFood = new Cabbage(price,mass);
                    Log.LOG.debug("Сгенерировал коробку с капустой");
                    break;
            }
            Log.LOG.trace("Сгенерированная еда: " + plansFood);
            generatedFood.add(plansFood);
        }
        return generatedFood;
    }
}
