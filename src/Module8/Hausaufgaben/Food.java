package Module8.Hausaufgaben;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 */
public abstract class Food {
    private static long id;
    private String name;
    private Country country;
    private int expiresIn;

    public Food(String name, Country country, int expiresIn) {
        id = idGenerator.generateId();
        this.name = name;
        this.country = country;
        this.expiresIn = expiresIn;
    }

    public static long getId() {
        return id;
    }

  /*  public static void setId(long id) {
        Food.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "Food:" + "id: " + id + "; name: " + name + "; country of origin: " + country +
                "; expires in (days): " + expiresIn + ".";
    }

    @Override
    public int hashCode() {
        return (int)(getId()^(getId()>>> 32));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
