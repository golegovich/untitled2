package Module7.Offline.Hausafgaben;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Georgii Tarasenko
 * on 15/05/2017
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User (1, "John", "Terry", "London", 10000);
        User user2 = new User (2, "Eden", "Hazard", "Bruxelles", 20000);
        User user3 = new User (3, "Diego", "Costa", "Sao Paolo", 15000);
        User user4 = new User (4, "Marcos", "Alonso", "Seville", 9000);
        User user5 = new User (5, "N'Golo", "Kante", "Marseilles", 17000);
        User user6 = new User (6, "Mishy", "Batshuayi", "Brugge", 8000);
        User user7 = new User (7, "Cristiano", "Ronaldo", "Madrid", 50000);
        User user8 = new User (8, "Sergio", "Ramos", "Valencia", 25000);
        User user9 = new User (9, "Gareth", "Bale", "Cardiff", 30000);
        User user10 = new User (10, "Karim", "Benzema", "Algiers", 1000);

        List<Order> orders = new ArrayList<>(10);

        Order order1 = new Order (1, 20, Currency.USD, "Mark1", "Gatlng", user1);
        Order order2 = new Order (2, 10, Currency.UAH, "Mark2", "Browning", user2);
        Order order3 = new Order (3, 40, Currency.UAH, "Mark3", "Colt", user4);
        Order order4 = new Order (4, 500, Currency.USD, "Mark4", "Walter", user6);
        Order order5 = new Order (5, 40, Currency.USD, "Mark3", "Colt", user4);
        Order order6 = new Order (6, 600, Currency.UAH, "Mark6", "Kingsman", user7);
        Order order7 = new Order (7, 400, Currency.UAH, "Mark7", "Gatlng", user8);
        Order order8 = new Order (8, 100, Currency.USD, "Mark8", "Colt", user2);
        Order order9 = new Order (9, 200, Currency.USD, "Mark9", "Gatlng", user10);
        Order order10 = new Order (10, 450, Currency.UAH, "Mark10", "Walter", user5);

        orders.addAll(Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ));
        System.out.println("A collection of orders: ");
        orders.forEach(System.out::print);

        Collections.sort(orders, Comparator.reverseOrder());
        print("Collection sorted in the reversed order: ", orders);
    }



















    public static void print(String string, List orders){
        System.out.println(string);
        System.out.println(orders);
    }
}
