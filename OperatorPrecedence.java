public class OperatorPrecedence {
    public static void main(String[] args) {
        //Example 1 : Arithmetic and Assignment Operators
        int a = 10, b = 5, c = 2;
        int result = a + b + c;//Multiplication (*) has higher precedence than addition (+)
        System.out.println(" Result (a + b + c ) : "+ result);

        //Example 2 : Parentheses Changing Precedence
        result = (a + b) * c;
        System.out.println(" Result (( a + b ) * c) : "+ result);//Output : 30

        //Example 3 : Relation and Logical Operators
        boolean isTrue = (a > b ) && ( b > c );//Relation (>) executes first, then Logical AND (&&)
        System.out.println(" isTrue (( a > b ) && ( b > c)) : " + isTrue);//Output : true

        //Example 4 : Bitwise vs Logical Operators
        boolean logicTest = true || false && false; //AND ( && ) executes before OR (||)
        System.out.println(" Logical Test ( True || false && false ) : " + logicTest);//Output : true

        //Example 5 : Assignment Operators with Arithmetics
        int x = 5;
        x += 10 * 2;// Multiplication (*) happens before assignment ( += )
        System.out.println(" X after ( x += after ( x += 10 * 2 ) : " + x);// Output : 25

        //Example 6 : Ternary Operator Precedence
        int y = 10;
        int z = 20;
        int min = (y < z ) ? y : z; //Ternary operator has lower precedence than comparison
        System.out.println(" Minimum value using ternary : "+min);

    }
}
