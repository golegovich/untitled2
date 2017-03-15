package Module7.Offline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by George on 09/03/2017.
 */
public class UseShapes {
    public static void main(String[] args) {
        List<Shape> listShape = new ArrayList<>();
       listShape.add("Some");
        listShape.add(new Rectangle(6,4));
        listShape.add(new Rectangle(2,3));

    }

    private static void  areaOutput(List listShape) {
        for (Object obj: listShape){
            if (obj instanceof Shape){
                ;
            }
        }

    }
}
