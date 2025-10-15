package ie.atu;

import java.util.ArrayList;

public class Student {
    String name;
    String email;
    String course;

    Student(){
        name = "not set";
        email = "not set";
        course = "not set";
    }

    void setName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setCourse(String course){
        this.course = course;
    }

    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    String getCourse(){
        return course;
    }

    static boolean uniqueEmail(String email, ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }
}
