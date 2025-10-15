package ie.atu;

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
}
