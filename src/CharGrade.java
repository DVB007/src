import java.util.Scanner;


public class CharGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a character
        System.out.print("Enter a grade (A, B, C, D, or F ) : ");
        char grade = scanner.next().toUpperCase().charAt(0);
        //.charAt(0) = Read the first character input
        //.toUpperCase() = convert to upperCase when input lowerCase

        //Evaluate the character using switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent! Keep up the great work.");
                break;
            case 'B':
                System.out.println("Good job! You can aim higher.");
                break;
            case 'C':
                System.out.println("Fair. There's room for improvement.");
                break;
            case 'D':
                System.out.println("You passed, but consider reviewing the material.");
                break;
            case 'F':
                System.out.println("Failed. Don't give up-study and try again.");
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, E, or F");
        }
        scanner.close();
    }
}
