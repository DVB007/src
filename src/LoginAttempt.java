import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalUsers = 3;
        int maxAttempts = 3;

        userLoop:
        for (int user = 1; user <= totalUsers; user++){
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print(" User "+ user +" , attempts "+(attempts + 1) + " : Enter password ");
                String input = scanner.nextLine();

                //condition
                if (input.equals("banned")){
                    System.out.println("User "+ user + " entered a banned word. Skipping to next");
                    continue userLoop;
                }

                if (input.equals("secret")){
                    System.out.println("Access granted to user "+ user + " !\n");
                    continue userLoop;
                }
                System.out.println("Incorrect password.");
                attempts++;
            }
        }
        scanner.close();
    }
}
