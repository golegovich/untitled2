package Module8.Hausaufgaben;

import Module8.Hausaufgaben.Food.*;

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

        Food beverages = interfaceImpl.save(new Beverages("London Pride", Country.UK, ))
    }
}
