//Define the people class
public class People {

    //Fields (attributes )
    String name;
    int age;
    String peopleId;

    // Constructor = ត្រូវតែដាក់ឈ្មោះដូចclassហើយមិនអាចដាក់ក្នុង class static void mainបានទេ
    public People(String name, int age, String peopleId) {
        this.name = name;
        this.age = age;
        this.peopleId = peopleId;
    }

    //Method to display people information
    public void displayInfo() {
        System.out.println();
        System.out.println(" People ID : " + peopleId);
        System.out.println(" Name : " + name);
        System.out.println(" age : " + age);
        System.out.println();
    }

    // Main method to create and display people objects
    public static void main(String[] args) {

        //Creating people objects
        People people1 = new People(" Alice ", 29, " S101");
        People people2 = new People(" David ", 20, " S404");

        //Display information
        people1.displayInfo();
        people2.displayInfo();
    }

}
