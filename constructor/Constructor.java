package constructor;


import java.util.Scanner;

public class Constructor {
    String name;
    Scanner scanner = new Scanner(System.in);

    //Constructor have name same like class 100%
    //Constructor haven't return type and void

    //The purpose for Initialize first when variable or attribute no set the value
    public Constructor() {
        name = "Unknow";
    }

    //display name
    public void display() {
        System.out.println("Name : " + name);
    }

    //run process
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        s1.display();
    }
}
