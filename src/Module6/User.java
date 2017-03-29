package Module6;

/**
 * Created by George on 29/03/2017.
 */
public final class User {

    private long id;
    private String firstName, lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

}
