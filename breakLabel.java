public class breakLabel {
    public static void main(String[] args) {
        outerLoop://label
        for (int i = 0; true; i ++){//outer loop
            for (int j = 0 ; j < 3; j++){//inner loop
                System.out.println(" i : "+ i + ", j : "+ j);
                if (i == 1 && j == 1) {
                    break outerLoop; //Exits both loops
                }
            }
        }
        System.out.println(" Exited from loops.");
    }
}
