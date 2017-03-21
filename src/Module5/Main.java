package Module5;

/**
 * Created by George on 15/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        DAO[] dao = new DAO[]{new GoogleDAO()};

        System.out.println("\tDB before the changes: ");
        printAllDAO(dao);

        System.out.println("\t Request rooms: ");
        printRoomArray(controller.requestrooms(500, 2, "Marseille", "L'Imerialle"));
        printRoomArray(controller.requestrooms(200, 2, "Manchester", "Carrow Road Inn"));
        printRoomArray(controller.requestrooms(300, 3, "Kyiv", "Intercontinental"));

        System.out.println("\tCheck the GoogleDAO ");
        printRoomArray(controller.check(dao[0], dao[1]));
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