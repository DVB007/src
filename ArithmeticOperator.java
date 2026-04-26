public class ArithmeticOperator {
    public static void main(String[] args) {
        //Declare variables
        int a = 10, b = 3;

        //Arithmetic operations
        System.out.println("a + b = "+ (a + b ));//addition
        System.out.println("a - b = "+ (a - b ));//Subtraction
        System.out.println("a * b = "+ (a * b ));//Multiplication
        System.out.println("a / b = "+ (a / b ));//Division
        System.out.println("a % b = "+ (a % b));//Modulus

        //Increment and Decrement
        System.out.println("++a = " + (++a));// Pre-increment
        System.out.println("b++ = " + (b++));//posy-increment
        System.out.println("b After post-increment = " + b);
        System.out.println("--a = " + ( --a ));//Pre-Decrement
        System.out.println("b-- = " + ( b-- ));//Post-Decrement
        System.out.println("b After post-Decrement = " + b);
    }
}
