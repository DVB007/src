public class Lesson5 {
    public static void main(String[] args) {
        //TODO: code application login here
        //Step 1 : Declare and create an array
        int[] numbers = new int[3];

        // Step 2 : Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Step 3 : Print array values
        int i = 1;// ប្រកាសនៅខាងក្រៅ Loop
        System.out.println(" Array element : ");
        for (int display : numbers) {
            System.out.println("    Array" + i + " : " + display);
            i++;// វានឹងបូកបន្តពីតម្លៃចាស់
        }
    }
}
