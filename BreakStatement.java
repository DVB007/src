import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            //Display menu
            System.out.println("==== MATH CALCULATOR ====");
            System.out.println(" 1. Addition (+) ");
            System.out.println(" 2. Substraction (-) ");
            System.out.println(" 3. Multiplication (*) ");
            System.out.println(" 4. Division (/) ");
            System.out.println(" 5. Exit ");
            System.out.println(" Choose an operation : ");

            int choice  = scanner.nextInt();

            if (choice == 5){
                System.out.println(" Exiting... Goodbye !");
                break;//Exit the loop
            }

            System.out.print(" Enter first number : ");
            double num1 = scanner.nextDouble();

            System.out.print(" Enter second number : ");
            double num2 = scanner.nextDouble();

            double result;
            boolean validOperation = true;

            switch (choice){
                case 1 :
                    result = num1 + num2;
                    System.out.println(" + Result : " + result);
                    break;
                case 2 :
                    result = num1 - num2;
                    System.out.println(" - Result : " + result);
                    break;
                case 3 :
                    result = num1 * num2;
                    System.out.println(" * Result : " + result);
                    break;
                case 4 :
                    if (num2 == 0) {
                        System.out.println(" Error : Division by zero is not allowed!");
                        validOperation = false;
                    }else {
                        result = num1 /num2;
                        System.out.println(" / Result : " + result);
                    }
                    break;
                default:
                    System.out.println(" Invalid choice! Please choose a valid option.");
                    validOperation = false;
            }

            if (validOperation){
                System.out.println(" Calculation complete!");
            }
        }
        //close scanner
        scanner.close();
    }
}
