package aggregation;

public class StudentInformation {
    public static void main(String[] args) {
        Address add = new Address("Phnom Penh", "Cambodia");
        Student s = new Student(101, "David", add);
        s.display();
    }
}
