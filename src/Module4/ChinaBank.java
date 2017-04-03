package Module4;

/**
 * Created by George on 06/03/2017.
 */
public class ChinaBank extends Bank {
    Currency currency = Currency.USD;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 100;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 150;
        }
        return limit;


    }

    @Override
    int getLimitOfFunding() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 10000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 5000;
        }
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (currency.equals(Currency.USD)){
            rate = 1;
        }
        if (currency.equals(Currency.EUR)){
            rate = 0;
        }
        return rate;
    }

    @Override
    int getComission(int sum) {
        int comission = 0;
        if (currency.equals(Currency.USD)){
            comission = sum > 1000 ? 5:3;
        }
        if (currency.equals(Currency.EUR)){
            comission = sum >1000 ? 11:10;
        }
        return comission;
    }
/*
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (getLimitOfWithdrawal() > 0 && amount > getLimitOfWithdrawal()) {
            System.out.println("Withdrawal is impossible, the amount requested is out of the limit");
            return;
        }
        System.out.println("Withdrawn" + amount + currency.toString());
        System.out.println("Fee taken: " + getComission(amount) + "%");
        amount += (getComission(amount) * amount / 100);

        if (user.getBalance() - amount < 0) {
            System.out.println("Withdrawal impossible. Insufficient funds");
            return;
        }
        user.setBalance(user.getBalance() - amount);
        System.out.println("Your balance has been changed.\n");
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.println("Funding" + amount + currency.toString() + "to" + user.getName());
        if (getLimitOfFunding()>0 && amount > getLimitOfFunding()){
            System.out.println("Funding is impossible. Funding limit exceeded");
            return;
        }
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance has been changed.\n");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.equals(toUser)){
            System.out.println("Impossible to transfer yourself");
        }
        double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();
        System.out.println("Money being transferred");
        fundUser(toUser, amount);
        withdrawOfUser(fromUser, amount);

        if (toUser.getBalance() == toUserCurrentBalance||fromUser.getBalance() == fromUserCurrentBalance){
            System.out.println("Transaction impossible");
            // another attempt
            toUser.setBalance(toUserCurrentBalance);
            fromUser.setBalance(fromUserCurrentBalance);
        }
        System.out.println("Transaction successful");
    }

    @Override
    public void paySalary(User user) {
        int amount = user.getSalary();
        System.out.println(user.getName() + " made " + amount + currency.toString());
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance has been changed.\n");

    }
*/
}
