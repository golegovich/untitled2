package Module3.Task3;

import java.util.Date;

/**
 * Created by George on 22/02/2017.
 */
public class Course  {

    private Date startDate;
    String name;
    int hoursDuration;
    String teacherName;

    //Hereafter we create the first constructor
    public Course (Date startDate, String name){
            this.startDate = startDate;
            this.name = name;
    }
    //Creating the second constructor
    public  Course(int hoursDuration, String name, String teacherName){
            this.hoursDuration = hoursDuration;
            this.name = name;
            this.teacherName = teacherName;
    }


}
