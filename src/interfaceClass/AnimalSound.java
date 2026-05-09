package interfaceClass;

public class AnimalSound {
    public static void main(String[] args) {
        //Create ob
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        //display Dog
        myDog.makeSound();
        myDog.eat();

        //display Cat
        myCat.makeSound();
        myCat.eat();
    }
}
