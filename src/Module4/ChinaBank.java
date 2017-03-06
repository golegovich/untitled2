package Module4;

/**
 * Created by George on 06/03/2017.
 */
public abstract class ChinaBank extends Bank {
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
}
