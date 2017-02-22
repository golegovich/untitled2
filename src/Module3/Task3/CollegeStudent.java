package Module3.Task3;

/**
 * Created by George on 22/02/2017.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }
    public CollegeStudent(String firstName, String lastName, int group, Course [] coursesTaken
    int age, String collegeName, int rating, long id){
        this(firstName, lastName, group);
        this.setCouresTaken(coursesTaken);
        this.setAge(age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }


}
