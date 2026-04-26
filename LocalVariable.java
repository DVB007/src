import java.util.Scanner;

public class LocalVariable {
    /**
     *Learn about local variable
     */
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Age : "+age);

        //Calling a method that uses its own local variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int input = scanner.nextInt();
        calculateSquare(input);

        //Using local variables in a loop
        for (int i = 1; i<= 3 ; i++){
            System.out.println("Loop iteration "+ i);
        }
    }

    public static void calculateSquare(int number){
        int square = number * number ; //Local variable to this method
        System.out.println("Square of "+ number + " is : "+ square);
    }
}
