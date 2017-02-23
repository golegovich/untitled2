package Module3.Task3;

import java.util.Date;

/**
 * Created by George on 23/02/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(146,0,12), "Trump");
        Course course2 = new Course(new Date(1666,12,31), "Churchill");
        Course course3 = new Course(60, "G.W. Bush", "Einstein, Alfred" );
        Course course4 = new Course(120, "Bismark, Otto", "Caesar, Julius");
        Course course5 = new Course(40, "Cromwell, Oliver", " Henry VII");

        Student student1 = new Student("Robert", "Mugabe",1);
        Student student2 = new Student("Kim","Jong-un",2);

        CollegeStudent krasava1 = new CollegeStudent("Lee", "Kwan Yew", 3);
        CollegeStudent krasava2 = new CollegeStudent("Biruykov", new Course[]{course1,course2,course3});
        CollegeStudent krasava3 = new CollegeStudent("Dima", "Liubych", 4, new Course[]{course4, course5}, 12, "Marines Training Facility", 3, 11111994);

        SpecialistStudent bog1 = new SpecialistStudent("Abubakar", "Al-Bagdadi", 5);
        SpecialistStudent bog2 = new SpecialistStudent("Hussain", new Course[]{course1});
        SpecialistStudent bog3 = new SpecialistStudent(54762381);
    }

}