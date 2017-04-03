package Module5;

import java.util.Arrays;

/**
 * Created by George on 15/03/2017.
 */
public class TripAdvisorAPI implements API {

    private DAO dao = new TripAdvisorDAO();
    public Room[] rooms = dao.getAll();


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomSearchArray = new Room[0];
        Room searchingForRoom = new Room(0, price, persons, null, hotel, city);

        for (int i = 0; i < rooms.length; i++) {
            if (searchingForRoom.equals(rooms[i]) && rooms[i].getHotelName().equals(hotel))
                roomSearchArray = addElementToArray(roomSearchArray, rooms[i]);
        }
        return roomSearchArray;
    }

    private Room[] addElementToArray(Room[] roomsArray, Room newRoomsMember){

        Room[] newRoomsArray = Arrays.copyOf(roomsArray, roomsArray.length + 1);
        newRoomsArray[newRoomsArray.length - 1] = newRoomsMember;
        return  newRoomsArray;
    }
}
