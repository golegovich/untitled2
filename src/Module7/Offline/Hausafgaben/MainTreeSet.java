package Module7.Offline.Hausafgaben;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Georgii Tarasenko
 * on 22/05/2017
 */
public class MainTreeSet {
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

        TreeSet<Order> orders = new TreeSet<>();

        orders.add(new Order(1, 20, Currency.USD, "Mark1", "Gatlng", user1);
        orders.add(new Order(2, 1500, Currency.UAH, "Mark2", "Browning", user2);
        orders.add(new Order(3, 1500, Currency.UAH, "Mark3", "Colt", user4);
        orders.add(new Order(4, 500, Currency.USD, "Mark4", "Walter", user6);
        orders.add(new Order(5, 40, Currency.USD, "Mark3", "Colt", user4);
        orders.add(new Order(6, 600, Currency.UAH, "Mark6", "Kingsman", user7);
        orders.add(new Order(7, 400, Currency.UAH, "Mark7", "Gatlng", user8);
        orders.add(new Order(8, 100, Currency.USD, "Mark8", "Colt", user2);
        orders.add(new Order(9, 200, Currency.USD, "Mark9", "Gatlng", user10);
        orders.add(new Order(10, 450, Currency.UAH, "Mark10", "Walter", user5);

        System.out.println("Orders :" + orders);
        System.out.println(containsOrderWithLastName(orders, "Petrov"));
    }

    public static void removeOrdersWithCurrencyUSD (TreeSet<Order> orders){
        Iterator<Order> iterator = orders.iterator();
        Order order;
        while (iterator.hasNext()){
            order = iterator.next();
            if (order.getCurrency() == Currency.USD){
                iterator.remove();
            }
        }
    }
    private static Order ordersWithMaxPrice (TreeSet<Order> orders) {
        return (orders.isEmpty()) ? null : orders.last();
    }

    private static boolean containsOrderWithLastName (TreeSet<Order> orders, String lastName) {
        if (orders.isEmpty()) return false;
        for (Order order : orders) {
            if (order.getUser().getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

}
