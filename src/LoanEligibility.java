import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input details from user
        System.out.print(" Enter your age : ");
        int age = scanner.nextInt();

        System.out.print(" Enter you monthly salary : ");
        double salary = scanner.nextDouble();

        System.out.print(" Enter number months in current job : ");
        int monthsEmployed = scanner.nextInt();

        //Checking condition s using if-else
        if (age < 21 || age > 60){
            System.out.println(" Sorry, you are not eligible for a load due to age restrictions.");
        } else if (salary <= 300) {
            System.out.println(" Sorry, your salary is too low for loan eligibility. ");
        } else if (monthsEmployed < 6) {
            System.out.println(" Sorry, You need at least 6 months of employment to be eligible.");
        }else {
            System.out.println(" Congratulation! You are eligible for a loan.");
        }

        //Close Scanner input
        scanner.close();
    }
}
