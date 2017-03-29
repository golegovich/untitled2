package Module6.UsersTask;

import java.util.Arrays;

/**
 * Created by Georgii Tarasenko
 * on 29/03/2017
 */
public class UserMain {
    public static void main(String[] args) {
        User user1 = new User(1, "Jack", "White", 1000, 5000);
        User user2 = new User(2, "James", "Page", 1001, 10000);
        User user31 = new User(3, "Michael", "Caine", 1002, 3000);
        User user32 = new User(3, "Michael", "Caine", 1002, 3000);
        User user4 = new User(4, "David", "Gahan", 1003, 6000);
        User user5 = new User (5, "Keith", "Richards", 1004, 10000);

        User[] users = {user1, user2, user31, null, user4, user5, null, user32};

        System.out.println(Arrays.deepToString(users));
        users = UsersUtils.deleteEmptyUsers(users);
        System.out.println(Arrays.deepToString(users));

        System.out.println(Arrays.toString(UsersUtils.getUsersId(users)));

        System.out.println(user1.toString());
    }
}
