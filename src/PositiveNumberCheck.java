import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declare variable
        int number ;

        //process infinite do while loop
        do {
            System.out.print(" Enter a positive number : ");
            number = scanner.nextInt();
        }while (number >= 0);//check condition

        //print the result
        System.out.print(" You entered : " + number);
        scanner.close();

    }
}
