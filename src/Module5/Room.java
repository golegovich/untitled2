package Module5;

import java.util.Date;


/**
 * Created by George on 15/03/2017.
 */
public class Room {

    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;


    //constructor


    public Room(long id, int price, int persons,
                Date dateAvailableFrom, String hotelName,
                String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    //get-set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Room room = (Room) obj;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", price=" + price + ", persons" + persons + ", available from" + dateAvailableFrom +
                ", hotel" + hotelName + " ,city" + cityName + "}";
    }

    public boolean equalsForAllFields(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Room room = (Room) obj;

        if (id != room.id) return false;
        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (dateAvailableFrom != null ? dateAvailableFrom.equals(room.dateAvailableFrom) : room.dateAvailableFrom != null)
            return false;
        if (hotelName != null ? hotelName.equals(room.hotelName) : room.cityName == null) return false;
            return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;
    }
}
