package Module8.Hausaufgaben;

import java.util.List;
import java.util.Set;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 * ©. All rights reserved.
 */
public interface IManageSystem <T> {
    T save (T obj, double price);
    T save (T food);
    void delete (T obj);
    void deleteById (int id);
    T get (int id);
    Double getPrice (T obj);
    Set<T> getProducts();
    List <Double> getPrices();
}
