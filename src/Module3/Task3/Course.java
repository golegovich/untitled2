package Module3.Task3;

import java.util.Date;

/**
 * Created by George on 22/02/2017.
 */
public class Course  {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

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

    //Getters Setters
    public Date getStartDate(){
        return startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHoursDuration(){
        return hoursDuration;
    }
    public void setHoursDuration(){
        this.hoursDuration = hoursDuration;
    }
    public String getTeacherName(){
        return  teacherName;
    }
    public void setTeacherName(){
        this.teacherName = teacherName;
    }
}
