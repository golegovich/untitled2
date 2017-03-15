package Module5;

/**
 * Created by George on 15/03/2017.
 */
public interface DAO {
    Room save (Room room);
    boolean delete (Room room);
    Room update (Room room);
    Room findBy (long id);
}
