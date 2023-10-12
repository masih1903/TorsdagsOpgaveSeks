package TaskThree;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;


    public Teacher(String name, ArrayList<String>canTeach){

        super(name);
        this.canTeach = canTeach;

    }


    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            System.out.println("Teacher is qualified");
            currentCourses.add(course);
            return true;

        }
        else{
            System.out.println("Teacher is not qualified");
            return false;
        }

    }
}
