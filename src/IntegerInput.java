import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter if the input is an inter : ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // Read integer input
            System.out.println(" You entered : " + number);
        }else {
            System.out.println(" Invalid input! Please enter a valid integer. ");
        }
        scanner.close();//for close processing user input in background
    }
}
