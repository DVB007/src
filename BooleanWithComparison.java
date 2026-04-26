public class BooleanWithComparison {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Using comparison operators
        boolean isEqual = (a == b );//false
        boolean isNotEqual = (a != b); // true
        boolean isGreater = ( a > b );//false
        boolean isLess = ( a < b ); // true
        boolean isGreaterOrEqua = ( a >= b );//false
        boolean isLessOrEqual = (a <= b ); // true

        // Printing the results
        System.out.println("a == b : "+ isEqual);
        System.out.println("a != b : "+ isNotEqual);
        System.out.println("a > b : "+ isGreater);
        System.out.println("a =< b : "+ isLess);
        System.out.println("a >= b : "+ isGreaterOrEqua);
        System.out.println("a <= b : "+ isLessOrEqual);

        //Using comparison in an if-statement
        if( a < b ){
            System.out.println("a is less than b.");
        }else {
            System.out.println("a is not less than b.");
        }
    }
}
