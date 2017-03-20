package Module5;


/**
 * Created by George on 15/03/2017.
 */
public class Controller {
    static API apis[] = new API[3];

    public Controller(){
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requestrooms(int price, int persons, String city, String hotel){

        Room[] roomArray = new Room[20];
        int count = 0;
        Room[] rooms;

        for (int i; i<apis.length; i++){
            rooms = apis[i].findRooms(price, persons, city, hotel);
            System.arraycopy(rooms, 0, roomArray, count, rooms.length);
            count +=rooms.length;
        }
        return roomArray;
    }

    public Room[] check (DAO dao1, DAO dao2){
        Room[] rooms = new Room [0];
        Room[] rooms1 = dao1.getAll();
        Room[] rooms2 = dao2.getAll();

        int length1 = rooms1.length;
        int length2 = rooms2.length;
        int k = -1;

        for (int i=0; i<length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (rooms1[i] != null && rooms[i].equals(rooms2[j]) && j != k) {
                    k = j;
                    rooms = addElementToArray(rooms, rooms1[i]);
                    rooms = addElementToArray(rooms, rooms2[j]);
                }
            }
        }
        return rooms;
    }
    public static void saveToAllDAO(Room room, DAO[] dao){
        for (int i=0; i<dao.length; i++){
            dao[i].save(room);
        }
    }

    public static void deleteFromAllDAO(Room room, DAO[] dao){
        for (int i=0; i<dao.length; i++){
        dao[i].delete(room);
        }
    }
    public static void updateToAllDAO (Room room, DAO[] dao){
        for (int i=0; i<dao.length; i++){
            dao[i].update(room);
        }
    }
}
