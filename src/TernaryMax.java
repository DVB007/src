import java.util.Scanner;

public class TernaryMax {
    public static void main(String[] args) {
        //Declare variable
        int A, B , C ;
        Scanner scanner = new Scanner(System.in);

        //Input A , B , C for assign value
        System.out.print(" Enter Number of A : ");
        A = scanner.nextInt();
        System.out.print(" Enter Number of B : ");
        B = scanner.nextInt();
        System.out.print(" Enter Number of C : ");
        C = scanner.nextInt();


        //Using Nested Ternary Operator
        int Max = ( A > B ) ? (( A > C ) ? A : C ) : (( B > C ) ? B : C);
        System.out.println(" Maximum value : " + Max);
    }
}
