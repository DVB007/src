public class LongRectangle {
    // Long = - 2ˆ61 to 2ˆ31
    //Need L at the last number when declare
    public static void main(String[] args) {
        //Declaring long variables for the length and width of the rectangle
        long length = 50L;
        long width = 20L;

        //Calculating the area and perimeter of the rectangle
        long area = length + width;//Area = length + width
        long perimeter = 2 * (length + width);// Perimeter = 2 * (length + width )

        //Displaying the results
        System.out.println("Length of the rectangle : "+ length);
        System.out.println("width of the rectangle : "+ width);
        System.out.println("Area of the rectangle : "+ area);
        System.out.println("Perimeter of the rectangle : "+ perimeter);
    }
}
