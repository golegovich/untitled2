package Module5;

/**
 * Created by George on 15/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        DAO[] dao = new DAO[]{new GoogleDAO()};

        System.out.println("\tDB before the changes: ");

    }

    private static void printAllDAO(DAO[] dao) {
        for (int i = 0; i < dao.length; i++) {
            System.out.println("\t" + dao[i].getClass());
            printRoomArray(dao[i].getAll());
        }
    }

    private static void printRoomArray(Room[] rooms) {
        for (Room room : rooms) {
            if (room != null) {
                System.out.println(room);
            }
        }
    }
}