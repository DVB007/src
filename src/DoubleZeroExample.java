public class DoubleZeroExample {
    /*
    * need d at the last number when initialize
    *
    * */
    public static void main(String[] args) {
        // Declare double variable, including 0.0d
        double num1 = 10.0d;
        double num2 = 5.0d;
        double num3 = 0.0d;
        double result;

        // Performing arithmetic operations
        result = num1 / num2;//Division
        System.out.println("Result of num1 / num2 : "+ result);//should print 2.0

        result = num1 / num3;//Division by 0.0d (Will produce NaN)
        System.out.println("Results of num1 / num3 (division by zero ): "+ result);

        // Check if num3 is zero
        if (num3 == 0.0d){
            System.out.println("num3 is exactly 0.0d. ");
        }

        //Performing multiplication by 0.0d
        double product = num2 * num3;
        System.out.println("Result of num2 * num3 : " + product);

        //Adding 0.0d to another number
        double sum = num1 + num3;
        System.out.println("Result of num1 + num3 : "+ sum);
    }
}
