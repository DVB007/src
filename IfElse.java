import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input  product price and quantity
        System.out.print(" Enter product price : ");
        double price = scanner.nextDouble();
        System.out.print(" Enter quantity :");
        int quantity = scanner.nextInt();

        //Calculate total amount
        double totalAmount = price * quantity;
        double discount ;

        //Apply discount based on total amount
        if (totalAmount >= 100){
            discount = totalAmount * 0.10;//discount 10%
        }else {
            discount = totalAmount * 0.05; // discount 5%
        }
        double finalAmount = totalAmount - discount;

        //Display results
        System.out.println("\n Total Amount : $ "+ totalAmount);
        System.out.println("Discount Applied : $ "+ discount);
        System.out.println("Final Amount after Discount : $ "+ finalAmount);

        //close scanner
        scanner.close();
    }
}
