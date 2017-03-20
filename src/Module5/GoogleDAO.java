package Module5;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by George on 20/03/2017.
 */
public class GoogleDAO implements DAO {

    private static Room[] rooms = new Room [10];

    public  GoogleDAO(){

        rooms[0] = new Room(18, 100, 1, LocalDate.of(2017, Month.JANUARY, 1), "Landmark","London");
        rooms[1] = new Room(2, 200, 2, LocalDate.of(2017, Month.DECEMBER, 21), "Carrow Road Inn", "Manchester");
        rooms[2] = new Room(8, 150, 3, LocalDate.of(2017, Month.AUGUST, 6), "Parc de Princess", "Paris");
        rooms[3] = new Room(25, 500, 2, LocalDate.of(2017, Month.MAY, 31),  "L'Imperialle", "Marseille");
        rooms[4] = new Room(13, 300, 3, LocalDate.of(2018, Month.MARCH, 17), "Intercontinental", "Kyiv");
    }
    @Override
    public Room save(Room room) {
        int count = RoomsInDBQuant(rooms);
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
