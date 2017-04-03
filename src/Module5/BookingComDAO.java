package Module5;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Georgii Tarasenko
 * on 03/04/2017
 */
public class BookingComDAO implements DAO {
    private static Room[] rooms = new Room [10];

    public  BookingComDAO(){

        rooms[0] = new Room(18, 100, 1, LocalDate.of(2017, Month.JANUARY, 1), "Landmark","London");
        rooms[1] = new Room(2, 200, 2, LocalDate.of(2017, Month.DECEMBER, 21), "Carrow Road Inn", "Manchester");
        rooms[2] = new Room(8, 150, 3, LocalDate.of(2017, Month.AUGUST, 6), "Parc de Princess", "Paris");
        rooms[3] = new Room(25, 500, 2, LocalDate.of(2017, Month.MAY, 31),  "L'Imperialle", "Marseille");
        rooms[4] = new Room(13, 300, 3, LocalDate.of(2018, Month.MARCH, 17), "Intercontinental", "Kyiv");
    }
    @Override
    public Room save(Room room) {
        int count = RoomsInDBQuant(rooms);
        rooms[count] = room;
        System.out.println("Save: " + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int j = 0; j < rooms.length; j++){
            if (rooms[j] !=null && rooms[j].equalsForAllFields(room)){
                System.arraycopy(room, j+1, rooms, j, rooms.length - j - 1);
                rooms[rooms.length - 1] = null;
                System.out.println("Deleted: " + room);
                return true;
            }
        }
        System.out.println("No room in the DB");
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j].getId() == room.getId()){
                System.out.println("Update " + room);
                rooms[j] = room;
                return room;
            }
        }
        System.out.println("Upd: No room in the DB");
        return null;
    }
    @Override
    public Room findById(long id) {
        for (int j = 0; j < rooms.length; j++) {
            if (id == rooms[j].getId()) {
                System.out.println("Find by id: " + id + " " + rooms[j]);
                return rooms[j];
            }
        }
        System.out.println("Find by id: no room in the DB");
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

    private int RoomsInDBQuant(Room[] rooms){
        int c = 0;
        for (Room room: rooms) {
            if (room != null){
                c++;
            }
        }
        return c;
    }
}
