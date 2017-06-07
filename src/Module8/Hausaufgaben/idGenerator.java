package Module8.Hausaufgaben;

/**
 * Created by Georgii Tarasenko
 * on 07.06.2017.
 */
public class idGenerator {
    private static long counter;
    private idGenerator (){
    }
    public static long generateId(){
        return ++counter;
    }
}
