package Overloading;

public class Calculator {
    public static void main(String[] args) {
        Operation calc = new Operation();

        System.out.println(" add(2,3) : " + calc.add(2, 3));
        System.out.println(" add(2,3,4) : " + calc.add(2, 3, 4));
        System.out.println(" add(2.5,3.5) : " + calc.add(2.5, 3.5));
    }
}
