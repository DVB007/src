package constructor;

import java.util.Scanner;

public class Constructor2 {
    String name;
    int age;

    //Constructor with parameters
    public Constructor2(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    //Method Display
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //	បង្កើត និងកំណត់តម្លៃដើមឱ្យ Object នៃ class Constructor2
        Constructor2 s1 = new Constructor2("David", 19);
        Constructor2 s2 = new Constructor2("Phin", 20);

        //display
        s1.display();
        s2.display();

        //change value of constructor
        System.out.println(s2.name = "Dev " + s1.name);

        //way to use scanner to input value of constructor
        System.out.print("Enter new Name : ");
        s2.name = scanner.nextLine();//You can use setter for set value it's better than this
        s2.display();
    }
}
