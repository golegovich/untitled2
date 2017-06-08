package Module9;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by Georgii Tarasenko
 * on 08.06.2017.
 * ©. All rights reserved.
 */
public final class Orders {

    private Orders(){
    }

    public static void sortDecreasing(List<Order> orders){
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

    public static List<Order> defineCurrency(List<Order> orders, Currency currency) {
        return orders.stream().filter(o -> o.getCurrency() == currency).collect(Collectors.toList());
    }
    public static Map<String, List<Order>> sortUniqueCities (List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }

    public static boolean checkLN(List<Order> orders, String lastName) {
        return (orders.stream().anyMatch(order -> order.getUser().getLastName() == lastName));
    }

    public static void removeUSD(List<Order> orders) {
        orders.removeIf(order -> order.getCurrency() == Currency.USD);
    }
}
