package encapsulation;

public class Encapsulated {
    public static void main(String[] args) {
        //create ob student of Student class for calling
        Student student = new Student();

        //using setters to set data
        student.setName("David");
        student.setAge(20);
        student.setStudentId("S1234");

        //Using getters to access data
        System.out.println(" Name : " + student.getName());
        System.out.println(" Age : " + student.getAge());
        System.out.println(" Student ID : " + student.getStudentId());
    }
}
