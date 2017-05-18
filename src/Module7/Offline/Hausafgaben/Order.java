package Module7.Offline.Hausafgaben;

/**
 * Created by Georgii Tarasenko
 * on 15/05/2017
 */
public class Order implements Comparable<Order>{
    long id;
    int price;
    private Currency currency;
    String itemName;
    String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {return id;}

    public int getPrice() {return price;}

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public int compareTo(Order o) {
        int priceEval =((Integer) (getPrice())).compareTo(o.getPrice());
        if (priceEval !=0) return priceEval;

        int itemNameEval = getItemName().compareTo(o.getItemName());
        if (itemNameEval != 0) return itemNameEval;

        int shopIdEval = getShopIdentificator().compareTo(o.getShopIdentificator());
        if (shopIdEval != 0) return  shopIdEval;

        int userEv = getUser().compareTo(o.getUser());
        if(userEv != 0) return userEv;

        return getCurrency().compareTo(o.getCurrency());
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31*result+(getCurrency()!= null ? getCurrency().hashCode():0);
        result = 31*result+(getItemName()!= null ? getItemName().hashCode():0);
        result = 31*result+(getShopIdentificator()!= null ? getShopIdentificator().hashCode():0);
        result = 31*result+(getUser() != null ? getUser().hashCode() : 0);
        return  result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
