import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for boolean input
        System.out.print(" Do you like Java ? ( True / False ) : ");
        boolean likesJava = scanner.nextBoolean();

        //Display result based on boolean value
        if (likesJava) {
            System.out.println(" Great! java is awesome 1");
        }else {
            System.out.println(" Oh no! Maybe you will like it later.");
        }

        //close scanner
        scanner.close();
    }
}
