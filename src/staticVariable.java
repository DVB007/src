public class staticVariable {
    public static void main(String[] args) {
        //Accessing the static variable using ClassName
        System.out.println("Welcome to "+ school.schoolName+"!");

        //Creating instance of school
        school student1 = new school("Phin");
        school student2 = new school("David");

        //Displaying details
        student1.displayStudentDetail();
        student2.displayStudentDetail();

        //Changing the static variable
        school.schoolName = "ISTAD";
        //Accessing updated static variable
        System.out.println("\nUpdated School Name : ");
        student1.displayStudentDetail();
        student2.displayStudentDetail();
    }
}
