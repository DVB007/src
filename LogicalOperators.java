public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        //logical AND (&&)
        if (a < b && b < c){
            System.out.println(" Both conditions are true ( a < b AND b < c )");
        }

        //logical OR (||)
        if (a > b || b < c){
            System.out.println(" At least one condition is true ( a > b OR b < c )");
        }

        //Logical NOT (!)
        boolean isJavaFun = true;
        if (!isJavaFun){
            System.out.println(" Java is NOT fun");
        }else {
            System.out.println(" Java is fun!");
        }

        //combining Logical Operators
        if ((a < b || b > c) && !(a == 10) ) {
            System.out.println(" Complex condition met!");
        }else {
            System.out.println(" Complex condition NOT met!");
        }
    }
}
