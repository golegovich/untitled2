package Module3.Task3;

/**
 * Created by George on 22/02/2017.
 */
public class SpecialistStudent extends CollegeStudent {

    private long secretKey;
    private String email;


    public SpecialistStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialistStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialistStudent(long secretKey){
        super("","", 0);
    }
}
