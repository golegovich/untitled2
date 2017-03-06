package Module4;

/**
 * Created by George on 06/03/2017.
 */
public abstract class EUBank extends Bank {
    Currency currency = Currency.EUR;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 2000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 2200;
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
            limit = 20000;
        }
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (currency.equals(Currency.USD)){
            rate = 0;
        }
        if (currency.equals(Currency.EUR)){
            rate = 1;
        }
        return rate;
    }

    @Override
    int getComission(int sum) {
        int comission = 0;
        if (currency.equals(Currency.USD)){
            comission = sum > 1000 ? 7:5;
        }
        if (currency.equals(Currency.EUR)){
            comission = sum >1000 ? 4:2;
        }
        return comission;
    }
}
