package Module8.Hausaufgaben;

import Module8.Hausaufgaben.Food.Food;

import java.util.*;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 * ©. All rights reserved.
 */
public final class InterfaceImpl <T extends Food> implements  IManageSystem<T> {

    private Map<T, Double> database = new HashMap<>();

    @Override
    public T save(T food, double price) {
        database.put(food, price);
        return  food;
    }

    @Override
    public T save(T food) {
        database.put(food, 0.0);
        return food;
    }
    public void saveAll (Map <? extends T, Double> newDb){
        database.putAll(newDb);
    }
    @Override
    public void delete(T food) {
        database.remove(food);
    }

    @Override
    public void deleteById(int id) {
        Set<T> setOfFood = database.keySet();
        setOfFood.removeIf(t -> t.getId() == id);
    }

    @Override
    public T get(int id) {
        Set<T> setOfFood = database.keySet();
        for (T food : setOfFood) {
            if (food.getId() == id)
                return  food;
            }
            return null;
        }

    @Override
    public Double getPrice(T food) {
        return database.get(food);
    }

    @Override
    public Set<T> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<> (database.values());
    }
}
