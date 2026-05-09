package DeclareAndAccess;

public class DeclareAndAccess {
    /*
     * @param args the command line arguments
     * */

    public static void main(String[] args) {
        //Create object
        Student s1 = new Student();
        s1.name = "David";
        System.out.println("Student Name : " + s1.name);

        Student s2 = new Student();
        s2.name = "Bob";
        s2.setAge(25);

        System.out.println("Student Name : " + s2.name);
        System.out.println("Age " + s2.getAge());

        System.out.println("They are studying at " + Student.school);
        System.out.println(s1.name + " is from " + s1.country);
        System.out.println(s2.name + " is from " + Student.COUNTRY);

    }
}
