package classMethod;

public class Car {
    String brand;
    int year;

    public void setDetails(String carBrand, int carYear) {
        brand = carBrand;
        year = carYear;
    }

    //Method to display the car's information
    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Year : " + year);
    }
}
