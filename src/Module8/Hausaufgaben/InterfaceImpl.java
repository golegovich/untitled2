package Module8.Hausaufgaben;

import java.util.List;
import java.util.Set;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 * ©. All rights reserved.
 */
public final class InterfaceImpl <T extends Food> implements  IManageSystem {
    @Override
    public Object save(Object obj, double price) {
        return null;
    }

    @Override
    public Object save(Object food) {
        return null;
    }

    @Override
    public void delete(Object obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public Double getPrice(Object obj) {
        return null;
    }

    @Override
    public Set getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }
}
