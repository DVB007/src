import java.util.Scanner;

public class IfCheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number : ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(" The number " + num + " is even. ");
        }
        if (num % 2 != 0){
            System.out.println(" The number " + num + " is odd.");
        }
        scanner.close();
    }
}
