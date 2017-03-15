package Module7.Offline;

/**
 * Created by George on 09/03/2017.
 */
public abstract class Circle extends Shape {
  private   double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius*radius*Math.PI;
    }
}
