package Module9;
import java.util.*;


/**
 * Created by Georgii Tarasenko
 * on 08.06.2017.
 * ©. All rights reserved.
 */
public final class Orders {

    private Orders(){
    }

    public static void sortDecreasing (List<Order> orders){
        orders.sort(Comparator.comparing(Order::getPrice, Comparator.reverseOrder()));
    }

    public static void sortPriceCity (List<Order> orders){
        orders.sort(Comparator.comparing(Order::getPrice).thenComparing((o -> o.getUser().getCity())));

    }

    public static void sortItemShopidCity (List<Order> orders){
        orders.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
                .thenComparing(o -> o.getUser().getCity() ));
    }
}
