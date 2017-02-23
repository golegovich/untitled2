package Off;

/**
 * Created by George on 23/02/2017.
 */
public class Worker extends Person{
   private String address;
   private  double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

