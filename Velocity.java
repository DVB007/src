import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input how long
        System.out.print(" Enter distance (km) : ");
        BigDecimal distance = scanner.nextBigDecimal();

        //input hours
        System.out.print(" Enter time ( hours ) : ");
        BigDecimal time = scanner.nextBigDecimal();

        //Calculate velocity with 2 decimal places rounding
        //HALF...ចង់ឲ្យវាអាចបង្គត់លេខបានត្រូវ
        BigDecimal velocity = distance.divide(time, 2 , RoundingMode.HALF_UP);
        System.out.print(" Velocity : "+ velocity + " Km/h");

        //Close scanner for free resource
        scanner.close();

    }
}
