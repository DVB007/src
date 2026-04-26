import java.util.Scanner;

public class StudentObject {
    static class Student {
        Scanner scanner = new Scanner(System.in);

        // Method to print a message
        void sayHi() {
            System.out.print(" Enter your name : ");
            String name = scanner.nextLine();
            System.out.println(" Hi, I'm " + name);
        }
    }

    public static void main(String[] args) {
        // Create an object of Student
        Student s1 = new Student();

        // Call the method
        s1.sayHi();
    }
}
