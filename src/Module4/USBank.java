package Module4;

import java.util.*;

/**
 * Created by George on 06/03/2017.
 */
public abstract class USBank extends Bank {

    Currency currency = Currency.USD;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 1000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 1200;
        }
        return limit;


    }

    @Override
    int getLimitOfFunding() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = Integer.MAX_VALUE;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 10000;
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
            rate = 2;
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
            comission = sum >1000 ? 8:6;
        }
        return comission;
    }
}