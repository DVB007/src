import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter Grade : ");
        //input char and convert to uppercase
        //about charAt(0) is catch just one character on index 0
        char grade = scanner.next().toUpperCase().charAt(0);

        //process statement
        switch (grade){
            case 'A' :
                System.out.println(" Excellent!");
                break;
            case 'B' :
                System.out.println(" Well done. ");
                break;
            case 'C' :
                System.out.println(" Great. ");
                break;
                //Case 2 but run same process
            case 'D' :
            case 'E' :
                System.out.println(" You passed. ");
                break;
            default:
                System.out.println(" Invalid grade.");
        }

        //output variable grade
        System.out.println(" Your grade is : " + grade);
    }
}
