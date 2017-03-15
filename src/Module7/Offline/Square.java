package Module7.Offline;

/**
 * Created by George on 09/03/2017.
 */
public abstract class Square extends Shape {
    private double side;
    public Square(double side){
        this.side = side;
    }


    @Override
    double getArea() {
        return  side*side;
    }
}
