package encapsulation;

//student.java
public class Student {
    // Step 1 : Private fields
    private String name;
    private int age;
    private String studentId;

    // Step 2 : Public getter and setter methods for ea h field

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //You can add validation here
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //Example of simple validation
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println(" Age must be positive.");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


}


