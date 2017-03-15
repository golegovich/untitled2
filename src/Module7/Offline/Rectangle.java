package Module7.Offline;

/**
 * Created by George on 09/03/2017.
 */
public class Rectangle extends Shape {
public double sideA;
public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return sideA*sideB;
    }
}
