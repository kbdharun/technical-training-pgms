import java.util.*;

class Student {
    int roll;
    String name;
    int rank;
    String location;
    int pincode;

    // Constructor
    Student(int roll, String name, int rank, String location, int pincode) {
        this.roll = roll;
        this.name = name;
        this.rank = rank;
        this.location = location;
        this.pincode = pincode;
    }

    // Method to print student details
    void printStudent() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Rank: " + rank);
        System.out.println("Location: " + location);
        System.out.println("Pincode: " + pincode);
    }
}

public class Students {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "a", 99, "tan", 100));
        students.add(new Student(4, "b", 2, "ban", 500));
        students.add(new Student(6, "c", 5, "che", 600));
        students.add(new Student(2, "d", 80, "mum", 400));
        students.add(new Student(7, "e", 66, "tan", 1010));

        // Print details of each student
        for (Student student : students) {
            student.printStudent();
            System.out.println();
        }
    }
}