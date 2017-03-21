package Module5;

import java.time.LocalDate;
import java.time.Month;

import static Module5.Controller.apis;

/**
 * Created by George on 15/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        DAO[] dao = new DAO[]{new GoogleDAO(), new TripAdvisorDAO()};

        System.out.println("\tDB before the changes: ");
        printAllDAO(dao);

        System.out.println("\t Request rooms: ");
        printRoomArray(controller.requestrooms(500, 2, "Marseille", "L'Imerialle"));
        printRoomArray(controller.requestrooms(200, 2, "Manchester", "Carrow Road Inn"));
        printRoomArray(controller.requestrooms(300, 3, "Kyiv", "Intercontinental"));

        System.out.println("\tCheck the GoogleDAO and the TripAdvisorDAO ");
        printRoomArray(controller.check(dao[0], dao[1]));

        Room roomToDelete = new Room(2, 200, 2, LocalDate.of(2017, Month.DECEMBER, 21),
                "Carrow Road Inn", "Manchester");
        System.out.println("\tTDB after the room been deleted: ");
        Controller.deleteFromAllDAO(roomToDelete, dao);
        printAllDAO(dao);

        long id = 2;
        System.out.println("Find rooms by id: ");
        controller.findByIdInWholeDAO(id, dao);


        Room roomToBeUpdated = new Room(18, 100, 1, LocalDate.of(2017, Month.JANUARY, 1), "Landmark", "London");
        controller.updateToAllDAO(roomToBeUpdated, dao);
        System.out.println("\tDB after the room been updated: ");
        printAllDAO(dao);

        System.out.println("Find rooms: ");
        printRoomArray(apis[0].findRooms(300, 3, "Kyiv", "Intercontinental"));
        printRoomArray(apis[0].findRooms(500, 2, "Marseille", "L'Imperialle"));
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