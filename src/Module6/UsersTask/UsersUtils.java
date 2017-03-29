package Module6.UsersTask;

import java.util.Arrays;

/**
 * Created by Georgii Tarasenko
 * on 29/03/2017
 */
public class UsersUtils {

    public static User[] uniqueUsers (User[] users){
        if (users == null){
            return null;
    }

        User[] result = Arrays.copyOf(users, users.length);
        for (int i = 0; i <result.length; i++){
            boolean contains = false;

            for (int q = 0; q < i-1;){
                if (result[i].equals(result[q])){
                    contains = true;
                    System.arraycopy(result, 0, result, 0, q-1);
                    q = 0;
                }
                else {
                    q++;
                }
            }
        }
        return users;
    }
        static public User[] usersWithConditionalBalance(User[] users, int balance){
        User[] result = new User[users.length];
        int count = 0;
        for (User user : users) {
            if (user.getBalance() == balance){
                result[count++] = user;
            }
        }
        System.arraycopy(result, 0, result, 0, count);
        return result;
    }
    static final public void paySalaryToUsers(User[] users){
        for (User user : users) {
            if(user !=null){
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
    }
    static final public long[] getUsersId(User[] users){
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++){
            result[i] = users[i].getId();
        }
        return result;
    }
    static public User[] deleteEmptyUsers(User[] users){
        User[] result = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result[count++] = users[i];
            }
        }
        result = Arrays.copyOf(result, count);
        return result;
    }
}