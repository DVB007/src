package aggregation;

public class StudentInformation {
    public static void main(String[] args) {
        Address add = new Address("Phnom Penh", "Cambodia");
        Address add1 = new Address("Seim Reap", "Cambodia");
        Student s = new Student(101, "David", add);
        Student s1 = new Student(102, "Phin", add1);
        s.display();
        s1.display();
    }
}
