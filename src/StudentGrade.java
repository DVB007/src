import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input as float for marks
        System.out.print(" Enter marks : ");
        float marks = scanner.nextFloat();

        //Grade abd feedback based on the marks
        if (marks >= 90 && marks <= 100) {
            System.out.println(" Grade : A+ ");
            System.out.println(" feedback : Excellent ");
        }
        if (marks >= 80 && marks < 90) {
            System.out.println(" Grade : A ");
            System.out.println(" feedback : Very Good ");
        }
        if (marks >= 70 && marks < 80) {
            System.out.println(" Grade : B ");
            System.out.println(" feedback : Good ");
        }
        if (marks >= 60 && marks < 70) {
            System.out.println(" Grade : C ");
            System.out.println(" feedback : Better ");
        }
        if (marks >= 50 && marks < 60) {
            System.out.println(" Grade : D ");
            System.out.println(" feedback : Poor ");
        }
        if (marks < 50 && marks > 0) {
            System.out.println(" Grade : F ");
            System.out.println(" feedback : Failed ");
        }
        if (marks > 100 || marks <0 ){
            System.out.println(" Invalid Score! Please try again.");
        }

        //close input scanner by keyboard
        scanner.close();
    }
}
