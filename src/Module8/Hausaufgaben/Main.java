package Module8.Hausaufgaben;

import Module8.Hausaufgaben.Food.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 * ©. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        InterfaceImpl<Food> interfaceImpl = new InterfaceImpl<>();
        interfaceImpl.save(new DairyProducts("Mellowed Cheese", Country.FRANCE, 5), 45.0);
        interfaceImpl.save(new Bakery("Oat bread", Country.USA, 3), 15.5);
        interfaceImpl.save(new Berries("Water melon", Country.UKRAINE, 50), 3.7);

        Food beverages = interfaceImpl.save(new Beverages("London Pride", Country.UK, 120), 40);

        Groceries buckwheat = new Groceries("Zhmen'ka", Country.UKRAINE, 30);
        interfaceImpl.save(buckwheat);

        Map<Berries, Double> berriesDb = new HashMap<>();
        berriesDb.put(new Berries("Victory", Country.BRAZIL, 120), 12.0);
        interfaceImpl.saveAll(berriesDb);

        System.out.println(interfaceImpl.getProducts());
        System.out.println(interfaceImpl.getPrice(beverages));
        System.out.println(interfaceImpl.getPrices());
        System.out.println(interfaceImpl.get(4));
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
