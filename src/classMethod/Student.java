package classMethod;

public class Student {
    public void greet() {
        System.out.println(" Hello! Welcome to Java class.");
    }

    public static void main(String[] args) {
        Student student = new Student();//Create object
        student.greet();//call the method
    }
}
