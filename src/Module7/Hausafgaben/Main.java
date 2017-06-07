package Module7.Hausafgaben;
import java.util.*;
import java.util.List;

import static java.util.Comparator.reverseOrder;


/**
 * Created by Georgii Tarasenko
 * on 15/05/2017
 */
public class Main {
    public static void main(String[] args) {
         User user1 = new User(1, "John", "Terry", "London", 10000);
        User user2 = new User(2, "Eden", "Hazard", "Bruxelles", 20000);
        User user3 = new User(3, "Diego", "Costa", "Sao Paolo", 15000);
        User user4 = new User(4, "Marcos", "Alonso", "Seville", 9000);
        User user5 = new User(5, "N'Golo", "Kante", "Marseilles", 17000);
        User user6 = new User(6, "Mishy", "Batshuayi", "Brugge", 8000);
        User user7 = new User(7, "Cristiano", "Ronaldo", "Madrid", 50000);
        User user8 = new User(8, "Sergio", "Ramos", "Valencia", 25000);
        User user9 = new User(9, "Gareth", "Bale", "Cardiff", 30000);
        User user10 = new User(10, "Karim", "Benzema", "Algiers", 1000);

        List<Order> orders = new ArrayList<>(10);

        Order order1 = new Order(1, 20, Currency.USD, "Mark1", "Gatlng", user1);
        Order order2 = new Order(2, 1500, Currency.UAH, "Mark2", "Browning", user2);
        Order order3 = new Order(3, 1500, Currency.UAH, "Mark3", "Colt", user4);
        Order order4 = new Order(4, 500, Currency.USD, "Mark4", "Walter", user6);
        Order order5 = new Order(5, 40, Currency.USD, "Mark3", "Colt", user4);
        Order order6 = new Order(6, 600, Currency.UAH, "Mark6", "Kingsman", user7);
        Order order7 = new Order(7, 400, Currency.UAH, "Mark7", "Gatlng", user8);
        Order order8 = new Order(8, 100, Currency.USD, "Mark8", "Colt", user2);
        Order order9 = new Order(9, 200, Currency.USD, "Mark9", "Gatlng", user10);
        Order order10 = new Order(10, 450, Currency.UAH, "Mark10", "Walter", user5);

        orders.addAll(Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10));
        System.out.println("A collection of orders: ");
        orders.forEach(System.out::print);

        /*Collections.sort(orders, reverseOrder());
        print("Collection sorted in the reversed order: ", orders);

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int priceIncreaseEval = ((Integer) (o1.getPrice())).compareTo(o2.getPrice());
                if (priceIncreaseEval != 0) {
                    return priceIncreaseEval;
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        print(" Collection sorted in 'item, name, city' order: ", orders);
        //deleting duplicates
        List<Order> uniqueOrder1 = new ArrayList<>(new HashSet<>(orders));
        print("Duplicates removed from the collection: ", uniqueOrder1);
        //removing positions with the price less than 1500
        List<Order> ordersLessThan1500 = new ArrayList<>(orders);
        for (Iterator<Order> iterator = ordersLessThan1500.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getPrice() < 1500)
                iterator.remove();
        }
        print("Items less than 1500 removed: ", ordersLessThan1500);

        //dividing list into hryvniyas and dollars
        List<Order> ordersUAH = new ArrayList<>();
        List<Order> ordersUSD = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCurrency() == Currency.UAH)
                ordersUAH.add(order);
            else if (order.getCurrency() == Currency.USD)
                ordersUSD.add(order);}
        print("USD orders: ", ordersUSD);
        print("UAH orders: ", ordersUAH);

        //dividing list into multitude of lists on the basis of User' cities
        Map<String, List<Order>> uniqueCitiesMap = new TreeMap<>();
        String city;
        for (Order order : orders) {
            city = order.getUser().getCity();
            List<Order> list = uniqueCitiesMap.get(city);
            if (list == null) {
            list = new ArrayList<Order> ();
            uniqueCitiesMap.put(city, list);
            }
            list.add(order);
        }
        for (String key : (uniqueCitiesMap.keySet())){
            print(key.toString(), uniqueCitiesMap.get(key));
        }
*/
    //******************************************************

        orders.sort(reverseOrder());
        System.out.println("Collections decreasing: " );
        orders.forEach(System.out::print);

        orders.sort((Order o1, Order o2) -> {
            int priceGrowthEval = ((Integer)(o1.getPrice())).compareTo(o2.getPrice());
            if (priceGrowthEval != 0){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        System.out.println("Sorted by price growth and user' city: ");
        orders.forEach(System.out::print);

        orders.sort((o1, o2) -> {
            int itemNameEval = o1.getItemName().compareTo(o2.getItemName());
            if (itemNameEval != 0){
                return itemNameEval;
            }
            int shopIdEval = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (shopIdEval != 0){
                return shopIdEval;
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        System.out.println("Collection sorted in 'item name/shop id' order: ");
        orders.forEach(System.out::print);

        List<Order> uniqueOrders = new ArrayList<>(new HashSet<>(orders));
        System.out.println("Duplictes removed: ");
        uniqueOrders.forEach(order -> System.out.println(order));

        List<Order> ordersLess1500 = new ArrayList<>(orders);
        ordersLess1500.removeIf(o -> o.getPrice() > 1500);
        System.out.println("Less than 1500 removed: ");
        ordersLess1500.forEach((order -> System.out.println(order)));

        List<Order> ordersUSD = new ArrayList<>(orders);
        ordersUSD.removeIf(o -> o.getCurrency() != Currency.USD);
        System.out.println("Orders USD: ");
        orders.forEach(order -> System.out.println(order));

        List<Order> ordersUAH = new ArrayList<>(orders);
        ordersUAH.removeAll(ordersUSD);
        System.out.println("Orders in UAH: ");
        ordersUAH.forEach(order -> System.out.println(order) );
    }

    public static void print(String string, List orders){
        System.out.println(string);
        System.out.println(orders);
    }
}
