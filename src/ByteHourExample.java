import java.util.Scanner;

public class ByteHourExample {
    /*
    byte length = -128 to 127
    * */
    public static void main(String[] args) {
        // Step 1 : Declare byte variable for hours
        byte morningStart = 6;//Morning start at 6AM
        byte afternoonStart = 12;//Afternoon start at 12 AM
        byte eveningStart = 18;//Evening start at 6 PM
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Current hour to calculate : ");
        byte currentHour = scanner.nextByte();//Example : Current time is ...

        // Step 2 : Display current time period based on conditions
        if (currentHour >= morningStart && currentHour < afternoonStart){
            System.out.println("Good Morning : "+ currentHour);
        }else if (currentHour >= afternoonStart && currentHour < eveningStart){
            System.out.println("Good Afternoon : "+ currentHour);
        } else if (currentHour >= eveningStart && currentHour <24) {
            System.out.println("Good Evening : "+ currentHour);
        } else if (currentHour >= 0 && currentHour < morningStart) {
            System.out.println("Good Night :" + currentHour);
        }else {
            System.out.println("Invalid hours ! Please try again.");
        }

        // Step 3 : Adding hours to simulate future events
        byte houserToAdd = 5;
        //Handle wrapping around the 24-hour clock
        byte futureHour = (byte) ((currentHour + houserToAdd) % 24 );

        //Step 4 : Display future time
        System.out.println("In next " + houserToAdd + " hours, it will be "+ futureHour + ":00 hours");
    }
}
