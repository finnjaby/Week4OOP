package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        int count =0;
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students do you want to enter? ");
        int studentAmount = sc.nextInt();
        sc.nextLine();

        while(count<studentAmount) {
            System.out.print("Please enter students name: ");
            String name = sc.nextLine();
            System.out.print("Please enter students email: ");
            String email = sc.nextLine();
            System.out.print("Please enter students course: ");
            String course = sc.nextLine();

            Student studentTemp = new Student();
            studentTemp.setName(name);
            studentTemp.setEmail(email);
            studentTemp.setCourse(course);
            students.add(studentTemp);
            count++;

        }
        for(Student student : students) {
            System.out.println("Name: " + student.getName() + " Email: " + student.getEmail() + " Course: " + student.getCourse());
        }
    }
}