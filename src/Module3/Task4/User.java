package Module3.Task4;

/**
 * Created by George on 23/02/2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    private final int fee1 = 5;
    private final int fee2 = 10;
    private final boolean IS_LOG_ENABLED = true;

    public User(String name, int balance, int monthsOfEmployment,
                String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public static void main(String[] args) {
        User user1 = new User("Phillip Morris", 20000, 48, "Phillip Morris Intl", 2000, "EUR");
        user1.withdraw(5000);
        user1.withdraw(7000);
        user1.withdraw(500);
    }

    public void withdraw(int sum){
        int balanceAfterWithdrawalWithFee = balance - sum - (int)(sum*(sum<1000? fee1:fee2)/100);
        boolean isWithdrawalPermitted = balanceAfterWithdrawalWithFee >=0;

        showLog(.CURRENT_BALANCE );
    }

    public void showLog(String information){
        if (!IS_LOG_ENABLED){
            return;
        }
        System.out.println(information);
    }


}
