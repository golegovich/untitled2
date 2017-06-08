package Module9;

/**
 * Created by Georgii Tarasenko
 * on 30/03/2017
 */
public class User  {
    long id;
    String firstName;
    String lastName;
    String city;
    int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode():0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + getBalance();
        return result;
    }
/*

    @Override
    public int compareTo(User o) {
        int balanceEval = ((Integer) getBalance()).compareTo(o.getBalance());
        if (balanceEval != 0) return  balanceEval;

        int lastNameEv = getLastName().compareTo(o.getLastName());
        if (lastNameEv != 0) return lastNameEv;

        int firstNameEv = getFirstName(). compareTo(o.getFirstName());
        if (firstNameEv != 0) return firstNameEv;

        return getCity().compareTo(o.getCity());
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (getBalance() != user.getBalance()) return false;
        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) : user.getLastName() != null)
            return  false;
        return  getCity() != null ? getCity().equals(user.getCity()) : user.getCity() == null;
    }

}
