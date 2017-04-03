package Module4;

/**
 * Created by Georgii Tarasenko
 * on 03/04/2017
 */
public class BankSystemImplementation implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Object o = new Object();
        o.equals(o);
    }
    int getLimitOfFunding(User user) {
        int limit = 0;
        if (user.getBank().getCurrency().equals(Currency.USD)) {
            limit = Integer.MAX_VALUE;
        }
        if (user.getBank().getCurrency().equals(Currency.EUR)) {
            limit = 10000;
        }
        return limit;
    }
    int getMonthlyRate(User user) {
        int rate = 0;
        if (user.getBank().getCurrency().equals(Currency.USD)){
            rate = 1;
        }
        if (user.getBank().getCurrency().equals(Currency.EUR)){
            rate = 2;
        }
        return rate;
    }
    @Override
    public void fundUser(User user, int amount) {
        System.out.println("Funding " + user.getBank().getCurrency().toString() + " to " + user.getName());
        if (getLimitOfFunding(user) > 0 && amount > getLimitOfFunding(user)) {
            return;
        }
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance has been changed.\n");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
     if (fromUser.equals(toUser))  {
         System.out.println("Self-transfer is impossible.\n");
         return;
     }
     double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();

        System.out.println("Money is being transferred");
        fundUser(toUser, amount);
        withdrawOfUser(fromUser, amount);

        if (toUser.getBalance() == toUserCurrentBalance || fromUser.getBalance() == fromUserCurrentBalance) {
            System.out.println("Transfer impossible");
            toUser.setBalance(toUserCurrentBalance);
            fromUser.setBalance(fromUserCurrentBalance);
        }

        System.out.println("Transaction successful. Both balances were changed. ");
    }

    @Override
    public void paySalary(User user) {
        int amount = user.getSalary();
        System.out.println(user.getName() + " made " + amount + user.getBank().getCurrency().toString());
        user.setBalance(user.getBalance() + amount);
        System.out.println("YOur balance has been changed.\n");
    }
}
