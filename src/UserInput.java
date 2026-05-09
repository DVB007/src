import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Taking a single word input using next();
        System.out.println(" Enter a word ( Can't input space ) : ");
        String word = scanner.next();//Reads only the first word before space
        System.out.println(" You entered (word) ) : "+ word);

        // 2. Clear the buffer ( useful after nextInt or next())
        scanner.nextLine();// To consume the leftover newline character

        //3. Taking a full line input using nextLine ()
        System.out.println(" Enter a sentence ( Can be input space ) : ");
        String sentence  = scanner.nextLine();//Reads the entire line with spaces
        System.out.println(" You entered  ( sentence ) : " + sentence);

        //4. Close the scanner to free resources
        scanner.close();
    }
}
