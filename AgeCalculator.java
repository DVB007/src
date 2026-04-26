import java.util.Scanner;

public class AgeCalculator {
    /*
    * int = -2ˆ31 to 2ˆ31
    * */
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their birth year
        System.out.println("Enter your birth year : ");
        int birthYear = scanner.nextInt();//birth year entered as an int

        //Get the current year
         int currentYear = 2026;

         // Calculate age
        int age = currentYear - birthYear;

        // Display the age
        System.out.println("\n Your age is : "+ age +  "years.");
        scanner.close();
    }
}
