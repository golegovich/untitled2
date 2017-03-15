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
        int balanceAfterWithdrawalWithFee = balance - sum -(sum*(sum<1000? fee1:fee2)/100);
        boolean isWithdrawalPermitted = balanceAfterWithdrawalWithFee >=0;

        log(Output.CURRENT_BALANCE + currency + balance);
        log(Output.WITHDRAWAL_ATTEMPT + currency + sum);
        log(Output.FEE + (sum < 1000 ? fee1 : fee2) + "%");

        if (!isWithdrawalPermitted){
            log(Output.WITHDRAWAL_IMPOSSIBLE + currency + balance);
            log(Output.SPLITTER);
            return;
        }
        log(Output.BALANCE_AFTER_TRANSACTION + currency + balanceAfterWithdrawalWithFee);
        balance = balanceAfterWithdrawalWithFee;

        log(Output.SUCCESS);
        log(Output.CURRENT_BALANCE + currency + balance);
        log(Output.SPLITTER);
    }

    public void log(String information){
        if (!IS_LOG_ENABLED){
            return;
        }
        System.out.println(information);
    }
    public void paySalary(int addMonth){

        log(Output.EARNED_SALARY + currency + salary);
        balance += salary;
        log(Output.CURRENT_BALANCE + currency + balance);
        log(Output.SPLITTER);
    }
     public int companyNamelength() {
         return getCompanyName().length();
     }
     public void monthIncrement(int addMonth){
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
     }
     public int getMonthsOfEmployment(){
         return monthsOfEmployment;
     }
     public void setMonthsOfEmployment(int monthsOfEmployment){
         this.monthsOfEmployment = monthsOfEmployment;
     }
     public String getCompanyName(){
         return companyName;
    }


    //Get-set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
