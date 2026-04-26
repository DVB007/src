import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        //input number integer to infinite while loop
        System.out.print(" Enter a number ( 0 to exit ) : ");
        number = scanner.nextInt();
        while (number != 0) {

            System.out.println(" You entered : " + number);
            System.out.print(" Enter another number ( 0 to exit) : ");
            number = scanner.nextByte();
        }
        System.out.println(" Loop terminated. Goodbye !");
        scanner.close();
    }
}
