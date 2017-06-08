package Module9;
import java.util.*;
import java.util.stream.Collectors;


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

    public static List<Order> getOrdersLess1500(List<Order> orders) {
        return orders.stream().filter((Order o) -> o.getPrice() >= 1500)
                .collect(Collectors.toList());
    }
    public static List<Order> getUnique (List<Order> orders) {
        return orders.stream().distinct().collect(Collectors.toList());
    }
}
