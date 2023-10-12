package TaskThree;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
    }







    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)){
            System.out.println("Cannot add course that is already passed");
            return false;

        }
        else{
            currentCourses.add(course);
            System.out.println("Course is added");
            return true;
        }
    }
}
