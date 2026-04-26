package polymorphism;

//SuperClass
class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

//SubClass
class Student extends Person {
    //Can be not use @Override method also it's still work
    //but should use @Override method to specific what you want to Override
    @Override
    void displayInfo() {
        System.out.println("This is a Student.");
    }
}

//SubClass
class Teacher extends Person {
    @Override
    void displayInfo() {
        System.out.println("This is Teacher.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        //Polymorphism : same reference, different object types
        Person person1 = new Person();
        Person person2 = new Student();
        Person person3 = new Teacher();

        //Display
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
