//Abstract class
abstract class Vehicle {
    //Abstract methods
    abstract void start();

    abstract void stop();

    //Concrete method
    void fuelType() {
        System.out.println(" Uses petrol or diesel.");
    }
}

//SubClass 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println(" Car is starting with a key.");
    }

    @Override
    void stop() {
        System.out.println(" Car is stopping using brakes.");
    }
}

// SubClass 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println(" Bike is starting with a kick or button.");
    }

    @Override
    void stop() {
        System.out.println(" Bike is stopping using hand brakes.");
    }
}

public class VehicleCar {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        System.out.println();
        myCar.start(); //Output : Car is starting with a key.
        myCar.stop();//Output : Car is stopping using brakes.
        myCar.fuelType();//Output : uses petrol or diesel.

        System.out.println();

        Vehicle myBike = new Bike();
        myBike.start();//Output : Bike is starting with a kick or button.
        myBike.stop();//Output : Bike is stopping using hand brakes.
        myBike.fuelType();//Output : uses petrol or diesel.
    }
}
