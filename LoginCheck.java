import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String correctUsername = "Admin";
        String correctPassword = "1234";

        String username , password;

        //process do while loop
        do {
            System.out.print(" Enter username : ");
            username = scanner.nextLine();

            System.out.print(" Enter password : ");
            password = scanner.nextLine();

            // ( username != admin (True) || password != 1234 (True) ) => Logical OR True =>print (invalid username or password)
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                System.out.println(" Invalid username or password. Try again.");
            }
        }while (!username.equals(correctUsername) || (!password.equals(correctPassword)));

        //print the result
        System.out.println(" Login successful!");
        //close scanner input keyboard
        scanner.close();
    }
}
