package Module3.Task3;

/**
 * Created by George on 22/02/2017.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course [] coursesTaken;
    private int age;
    private Course[] couresTaken;

    //Hereafter the first constructor starts
    public Student(String firstName, String lastName, int group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    //The second one
    public Student(String lastName, Course[] coursesTaken){
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public void setCouresTaken(Course[] couresTaken) {
        this.couresTaken = couresTaken;
    }
}
