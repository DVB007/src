package DeclareAndAccess;

public class Student {
    //Instance attributes (belong to each object )
    public String name;

    //Static attribute ( shared across all objects )
    public static String school = " ABC High School.";

    //Final attribute ( constant )
    public final String country = " Cambodia";

    public static final String COUNTRY = " UAS";//Constant shared by all students

    private int age;

    //setter method
    public void setAge(int a) {
        age = a;
    }

    //Getter method
    public int getAge() {
        return age;
    }
}
