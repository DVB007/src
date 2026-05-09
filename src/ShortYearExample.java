public class ShortYearExample {
    /*
    * short data type
    * 16-bit
    * -32 768 (-2ˆ15) to 32 767(2ˆ15-1)
    * default short is 0
    * */
    public static void main(String[] args) {
        // Define short values for years
        short startYear = 2006;
        short endYear = 2026;

        // Calculate the difference between the two years
        short yearDifference = (short) Math.abs(endYear - startYear);

        // Print year difference
        System.out.println("Start Year : "+ startYear);
        System.out.println("End Year : "+ endYear);
        System.out.println("Difference between the years : "+ yearDifference);

        //Leap year check for predefined years
        // Store such as Array
        short[] years = {
                2000,
                2024,
                2026,
                2028,
                2030
        };
        System.out.println("\n Leap Year Checks : ");
        for ( short year : years){
            if (isLeapYear(year)){
                System.out.println(year + " is a leap year.");
            }else {
                System.out.println(year + " isn't a leap year.");
            }
        }
    }

    //Method to check if a year is a leap year
    // (leap year) is the year that can divide to 4 ចែកដាច់នឹង4
    public static boolean isLeapYear(short year){
        return (year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0);
    }
}
