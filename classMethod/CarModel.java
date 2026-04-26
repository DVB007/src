package classMethod;

public class CarModel {
    public static void main(String[] args) {
        System.out.println();
        Car car1 = new Car();
        car1.setDetails("Toyota", 2020);
        car1.displayDetails();

        System.out.println();

        Car car2 = new Car();
        car2.setDetails("Honda", 2023);
        car2.displayDetails();
    }
}
