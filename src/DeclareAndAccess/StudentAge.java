package DeclareAndAccess;

class Student1 {
    private int age;

    //setter method
    public void setAge(int a) {
        age = a;
    }

    //Getter methods
    public int getAge() {
        return age;
    }
}

public class StudentAge {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setAge(21);
        System.out.println(s1.getAge());
    }
}
