package Offline2302;

/**
 * Created by George on 23/02/2017.
 */
public class SomeChild extends SomeParent {
    private String className = "[" + getClass().getSimpleName() + "]";
    private String name = "Georges";
    private String secondName;
    int years = calculate();

    {
        System.out.println(className + "init block");
        System.out.println(className + "Second name: " + secondName);
        secondName = name + years;
    }

    public SomeChild() {
        System.out.println(className + "constructor");
    }

    private int calculate() {
        System.out.println(className + "Calculate method");
        return 17;
    }

}
