package Module5;

/**
 * Created by George on 20/03/2017.
 */
public class GoogleDAO implements DAO {


    @Override
    public Room save(Room room) {
        return null;
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
