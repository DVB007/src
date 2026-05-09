class school {
    //Static variable shared by all instance of the class
    static String schoolName = "RUPP";

    //Instance variable specific to each student
    String studentName;

    //Constructor to initialize instance variable
    public school(String studentName) {
        this.studentName = studentName;
    }

    //Method to display student details
    public void displayStudentDetail() {
        System.out.println("Student : " + studentName);
        System.out.println("School : " + school.schoolName);
        //Access static variable using ClassName.VariableName
    }
}
