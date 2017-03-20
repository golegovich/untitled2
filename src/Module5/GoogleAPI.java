package Module5;

/**
 * Created by George on 15/03/2017.
 */
public class GoogleAPI implements API{

    private DAO dao = new GoogleDAO;
    public Room[] rooms = dao.getAll();



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomSearchArray = new Room [0];
        Room searchingForRoom = new Room(1, 100, 1, null, hotel, city);

        for (int i; i<rooms.length; i++){
            if (roomSearchArray.equals(rooms[i]) && rooms[i].getHotelName() ==hotel)
                roomSearchArray = addElementToArray(roomSearchArray, rooms[i]);
        }
        return roomSearchArray;
    }
}
