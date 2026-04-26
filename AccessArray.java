public class AccessArray {
    public static void main(String[] args) {
        //Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        //Access and print specific elements
        System.out.println(" First element : " + numbers[0]);
        System.out.println(" Third element : " + numbers[1]);
        System.out.println(" last element : " + numbers[4]);

        //Modify an element
        numbers[1] = 99;
        System.out.println(" Update second element : " + numbers[1]);
    }
}
