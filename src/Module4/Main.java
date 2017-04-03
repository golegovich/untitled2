package Module4;

/**
 * Created by George on 06/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank1 = new USBank();
        Bank bank2 = new EUBank();
        Bank bank3 = new ChinaBank();

        User user1 = new User(1, "Donald", 5000, 2, "POTUS", 10000, bank1);
        User user2 = new User (2, "Angela", 4000, 48, "Bundesrespublik", 8000, bank1);
        User user3 = new User (3, "Petro", 1500, 33, "Ukraine", 3500, bank2);
        User user4 = new User (4, "Xi", 6000, 14, "CPR", 1000, bank2);
        User user5 = new User (5, "Elizabeth", 4500,500, "UK", 1000, bank3);
        User user6 = new User(6, "Marine", 900, 1, "Front National", 300, bank3);

        System.out.println(user1);
       /* bank1.withdrawOfUser(user1, 500 );
        System.out.println(user1);
        bank1.paySalary(user1);
        System.out.println(user1);
        bank1.transferMoney(user2, user1, 1000);
        System.out.println(user1);
        bank1.fundUser(user1, 1000);
    */
        System.out.println(user1);
        System.out.println(user2);
    }
}
