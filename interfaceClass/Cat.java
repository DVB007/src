package interfaceClass;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says : Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}
