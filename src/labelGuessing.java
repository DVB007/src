import java.util.Scanner;

public class labelGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 7; //Hidden number

        guessLoop:
        while (true) {
            System.out.print(" Guess the number ( 1- 10 ) : ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                for (int i = 0; true; i ++){//outer loop
                    for (int j = 0 ; j < 3; j++){//inner loop
                        System.out.println(" i : "+ i + ", j : "+ j);
                        if (i == 1 && j == 1) {
                            break guessLoop; //Exits both loops
                        }
                    }
                }

            }else {
                System.out.println(" Wrong guess. Try again.");
            }
        }
        scanner.close();
    }
}
