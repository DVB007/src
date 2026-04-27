package aggregation;

public class Student {
    int id;
    String name;
    Address address;// Aggregation

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("ID : " + id + ", Name : " + name);
        System.out.println("City : " + address.city + ", country : " + address.country);
    }
}
