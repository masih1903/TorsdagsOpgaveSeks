package TaskThree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> canTeach = new ArrayList<String>();
        ArrayList<String> passedCourses = new ArrayList<String>();

        Teacher t1 = new Teacher("Jim", canTeach);
        t1.addCourse("MAT A");
        Teacher t2 = new Teacher("Simon", canTeach);
        t2.addCourse("ENG A");
        Teacher t3 = new Teacher("Charlotte", canTeach);
        t3.addCourse("TYSK B");

        Student s1 = new Student("Martin",passedCourses);
        s1.addCourse("MAT A");
        Student s2 = new Student("Jack", passedCourses);
        s2.addCourse("ENG A");
        Student s3 = new Student("John", passedCourses);
        s3.addCourse("TYSK B");

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);


        for (Person p : persons) {
            p.addCourse("Java 1.0");

        }


    }
}
